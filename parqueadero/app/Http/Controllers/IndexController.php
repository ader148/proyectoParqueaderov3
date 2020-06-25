<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Http;
use Illuminate\Support\Facades\Http as FacadesHttp;

class IndexController extends Controller
{
    

    public function index()
    {
        
        //url de la api que voy a consumir
        //usamos el cliente http que nos ofrece laravel
        //almacenamos el array 
        $parqueaderos = Http::get('http://localhost:8080/parqueadero/webresources/parqueaderos/');

        //lineas para testar repuesta y desplegarla de una mejor manera
        //echo('<pre>');
        //echo($parqueaderos);
        //echo('</pre>');

        //seteamos el tipo de formato de respuesta 
        $parqueaderos = $parqueaderos->json();

        

        //la variable repuesta esta lista para enviar a la vista

        //compact nos permite trasformar la respuesta json en un array para ser manejado en la vista
        return view('home', compact('parqueaderos'));
    }
}
