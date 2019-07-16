package co.app.viajero.viajero_seguro.fragments;

        import android.app.ProgressDialog;
        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Toast;

        import com.android.volley.Request;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.JsonObjectRequest;

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.util.ArrayList;

        import co.app.viajero.viajero_seguro.R;
        import co.app.viajero.viajero_seguro.Ver_informacion;
        import co.app.viajero.viajero_seguro.adapter.PaisImagenUrlAdapter;
        import co.app.viajero.viajero_seguro.entidades.Pais;
        import co.app.viajero.viajero_seguro.entidades.VolleySingleton;

/**
 * Created by tecno on 1/07/2019.
 */

public class ConsultaListaPaisImagenUrlFragment extends Fragment implements Response.Listener<JSONObject>,Response.ErrorListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    RecyclerView recyclerPais;
    ArrayList<Pais>listaPais;

    ProgressDialog dialog;

    // RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    public ConsultaListaPaisImagenUrlFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConsultaListaPaisImagenUrlFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ConsultaListaPaisImagenUrlFragment newInstance(String param1, String param2) {
        ConsultaListaPaisImagenUrlFragment fragment = new ConsultaListaPaisImagenUrlFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista= inflater.inflate(R.layout.fragment_consulta_lista_pais_imagen_url, container, false);

        listaPais=new ArrayList<>();

        recyclerPais = (RecyclerView) vista.findViewById(R.id.idRecyclerImagen);
        recyclerPais.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerPais.setHasFixedSize(true);

        // request= Volley.newRequestQueue(getContext());

        cargarWebService();

        return vista;

    }

    private void cargarWebService() {
        dialog=new ProgressDialog(getContext());
        dialog.setMessage("Consultando Información... ");
        dialog.show();

        String ip=getString(R.string.ip);

        String url=ip+"archivos/ejemploBDRemota/wsJSONConsultarListaImagenesUrl.php";
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        // request.add(jsonObjectRequest);
        VolleySingleton.getIntanciaVolley(getContext()).addToRequestQueue(jsonObjectRequest);
    }

    @Override
    public void onResponse(JSONObject response) {
        Pais pais=null;

        JSONArray json=response.optJSONArray("usuario");

        try {

            for (int i=0;i<json.length();i++){
                pais=new Pais();
                JSONObject jsonObject=null;
                jsonObject=json.getJSONObject(i);

                // Pais.setDocumento(jsonObject.optInt("documento"));

                pais.setPais(jsonObject.optString("pais"));
                pais.setCod(jsonObject.optString("cod"));
                pais.setIdioma(jsonObject.optString("idioma"));
                pais.setMoneda(jsonObject.optString("moneda"));
                pais.setRequisitos(jsonObject.optString("requisitos"));
                pais.setRutaImagen(jsonObject.optString("ruta_imagen"));
                pais.setIda(jsonObject.optString("ida"));
                pais.setIds(jsonObject.optString("ids"));
                pais.setIdt(jsonObject.optString("idt"));
                pais.setIdc(jsonObject.optString("idc"));
                listaPais.add(pais);
            }
            dialog.hide();
            PaisImagenUrlAdapter adapter=new PaisImagenUrlAdapter(listaPais, getContext());
            recyclerPais.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(getContext(), "No se ha podido establecer conexión con el servidor" +
                    " "+response, Toast.LENGTH_LONG).show();
            dialog.hide();
        }


    }






    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(getContext(), "No se puede conectar "+error.toString(), Toast.LENGTH_LONG).show();
        System.out.println();
        dialog.hide();
        Log.d("ERROR: ", error.toString());
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
