package co.app.viajero.viajero_seguro.interfaces;


import co.app.viajero.viajero_seguro.PaginaWeb;
import co.app.viajero.viajero_seguro.fragments.BienvenidaFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaCiudadImagenUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaPaisImagenUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaUsuarioImagenUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaUsuarioUrlFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultarListaUsuariosFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultarUsuarioFragment;
import co.app.viajero.viajero_seguro.fragments.ConsutarListausuarioImagenFragment;
import co.app.viajero.viajero_seguro.fragments.DesarrolladorFragment;
import co.app.viajero.viajero_seguro.fragments.RegistrarUsuarioFragment;

/**/

public interface IFragments extends BienvenidaFragment.OnFragmentInteractionListener,DesarrolladorFragment.OnFragmentInteractionListener,
        RegistrarUsuarioFragment.OnFragmentInteractionListener,ConsultarUsuarioFragment.OnFragmentInteractionListener,
        ConsultarListaUsuariosFragment.OnFragmentInteractionListener,ConsutarListausuarioImagenFragment.OnFragmentInteractionListener,
        ConsultaUsuarioUrlFragment.OnFragmentInteractionListener,ConsultaListaUsuarioImagenUrlFragment.OnFragmentInteractionListener,ConsultaListaPaisImagenUrlFragment.OnFragmentInteractionListener,ConsultaListaCiudadImagenUrlFragment.OnFragmentInteractionListener,PaginaWeb.OnFragmentInteractionListener {
}
