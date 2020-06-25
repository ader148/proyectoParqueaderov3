<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Http;
use Illuminate\Support\Facades\Http as FacadesHttp;

class ParqueaderoController extends Controller
{
    

    public function index()
    {
        
        
         if(isset($_REQUEST)){

            $data = array (
                'NombreParqueadero' => $_REQUEST['nombrePark'],
                'telefono' => $_REQUEST['telefono'],
                'direccion' => $_REQUEST['direccion'],
                'capacidad' => $_REQUEST['libres'],
                'ocupados' => $_REQUEST['ocupados'],
             );

         }else{
            $data = array (
                'NombreParqueadero' => '',
                'telefono' => '',
                'direccion' => '',
                'capacidad' => '',
                'ocupados' => '',
             );  
         }  

         
        return view('detalles_park')->withData($data);
    }
}
