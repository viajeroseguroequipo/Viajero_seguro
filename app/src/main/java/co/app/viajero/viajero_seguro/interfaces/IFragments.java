package co.app.viajero.viajero_seguro.interfaces;


import co.app.viajero.viajero_seguro.Blog;
import co.app.viajero.viajero_seguro.PaginaWeb;
import co.app.viajero.viajero_seguro.fragments.BienvenidaFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaCiudadImagenUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaPaisImagenUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultarUsuarioFragment;
import co.app.viajero.viajero_seguro.fragments.DesarrolladorFragment;
import co.app.viajero.viajero_seguro.fragments.RegistrarUsuarioFragment;

/**/

public interface IFragments extends BienvenidaFragment.OnFragmentInteractionListener,DesarrolladorFragment.OnFragmentInteractionListener,
        RegistrarUsuarioFragment.OnFragmentInteractionListener,ConsultarUsuarioFragment.OnFragmentInteractionListener,ConsultaListaPaisImagenUrlFragment.OnFragmentInteractionListener,ConsultaListaCiudadImagenUrlFragment.OnFragmentInteractionListener,PaginaWeb.OnFragmentInteractionListener,Blog.OnFragmentInteractionListener {
}
