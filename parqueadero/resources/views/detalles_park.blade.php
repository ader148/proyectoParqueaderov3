<!doctype html>
<html>

<head>
    <!-- Scripts -->
    <script src="{{ asset('js/app.js') }}" defer></script>

    <!-- Styles -->
    <link href="{{ asset('css/app.css') }}" rel="stylesheet">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

<body>

    <nav class="navbar navbar-inverse" style="background-color: transparent !important; width: 100%; position: fixed;">
        <div class="container-fluid">
            <div class="navbar-header" style="width:100%;">
                <div class="row">
                    <div class="col-sm-1"><i class="fas fa-car" style="color: white; font-size: 45pt;"></i></div>
                    <div class="col-sm-4">
                        <p style="font-size: 17pt; padding-top: 3%;color: white;">Informacion Parquaderos</p>
                    </div>
                    <div class="col-sm-7">
                        <div style="float: right;padding-top: 2%;">
                            <button type="button" class="btn btn-dark">Registrate</button>
                            <button type="button" class="btn btn-dark">Iniciar sesion</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </nav>

    <section class="jumbotron text-center" style="background-size: cover;background-image: url('http://localhost/parqueadero/public/imagenes/parking.jpg');    padding-top: 12%;
    padding-bottom: 10%;">


        <div class="container">
            <h1 class="jumbotron-heading" style="color: white;;">Parqueaderos Popayan</h1>
            <p class="lead text-muted" style="color: white;">Aqui encontraras toda la informacion sobre los parqueaderos de la ciudad de Popayan en tiempo real</p>
            <!--<p>
            <a href="#" class="btn btn-primary my-2">Main call to action</a>
            <a href="#" class="btn btn-secondary my-2">Secondary action</a>
          </p>-->
        </div>
    </section>

    <?php //var_dump($data); ?>

    <div class="container">
        <div class="row" style="text-align: center;">
            <div class="col-sm-12" style="margin-top: 2%;">
                <h1>{{ $data['NombreParqueadero'] }}</h1>
            </div>

            <div class="row" style="padding-left: 20%; padding-right: 20% !important; padding-right: 16%; padding-top: 2%;">
                <div class="col-sm-6">
                    <h3>Teléfono</h3>
                </div>
                <div class="col-sm-6">
                    <h3>{{ $data['telefono'] }}</h3>
                </div>

                <div class="col-sm-6">
                    <h3>Dirección</h3>
                </div>
                <div class="col-sm-6">
                    <h3>{{ $data['direccion'] }}</h3>
                </div>

                <div class="col-sm-6">
                    <h3>Puestos Ocupados</h3>
                </div>
                <div class="col-sm-6">
                    <h3>{{ $data['ocupados'] }}</h3>
                </div>

                <div class="col-sm-6">
                    <h3>Capacidad</h3>
                </div>
                <div class="col-sm-6">
                    <h3>{{ $data['capacidad'] }}</h3>
                </div>


            </div>

        </div>
    </div>


    <style>
        html {
            font-family: Lato, 'Helvetica Neue', Arial, Helvetica, sans-serif;
            font-size: 14px;
        }

        h5 {
            font-size: 1.28571429em;
            font-weight: 700;
            line-height: 1.2857em;
            margin: 0;
        }

        .card {
            font-size: 1em;
            overflow: hidden;
            padding: 0;
            border: none;
            border-radius: .28571429rem;
            box-shadow: 0 1px 3px 0 #d4d4d5, 0 0 0 1px #d4d4d5;
        }

        .card-block {
            font-size: 1em;
            position: relative;
            margin: 0;
            padding: 1em;
            border: none;
            border-top: 1px solid rgba(34, 36, 38, .1);
            box-shadow: none;
        }

        .card-img-top {
            display: block;
            width: 100%;
            height: auto;
        }

        .card-title {
            font-size: 1.28571429em;
            font-weight: 700;
            line-height: 1.2857em;
        }

        .card-text {
            clear: both;
            margin-top: .5em;
            color: rgba(0, 0, 0, .68);
        }

        .card-footer {
            font-size: 1em;
            position: static;
            top: 0;
            left: 0;
            max-width: 100%;
            padding: .75em 1em;
            color: rgba(0, 0, 0, .4);
            border-top: 1px solid rgba(0, 0, 0, .05) !important;
            background: #fff;
        }

        .card-inverse .btn {
            border: 1px solid rgba(0, 0, 0, .05);
        }

        .profile {
            position: absolute;
            top: -12px;
            display: inline-block;
            overflow: hidden;
            box-sizing: border-box;
            width: 25px;
            height: 25px;
            margin: 0;
            border: 1px solid #fff;
            border-radius: 50%;
        }

        .profile-avatar {
            display: block;
            width: 100%;
            height: 100%;
            border-radius: 50%;
        }

        .profile-inline {
            position: relative;
            top: 0;
            display: inline-block;
        }

        .profile-inline~.card-title {
            display: inline-block;
            margin-left: 4px;
            vertical-align: top;
        }

        .text-bold {
            font-weight: 700;
        }

        .meta {
            font-size: 1em;
            color: rgba(0, 0, 0, .4);
        }

        .meta a {
            text-decoration: none;
            color: rgba(0, 0, 0, .4);
        }

        .meta a:hover {
            color: rgba(0, 0, 0, .87);
        }
    </style>


    <footer style="margin-top: 5%; background-color: black;">
        <div class="row" style="text-align: center; color:white;">
            <h3 style="width: 100%; padding-top: 4%; padding-bottom: 4%;">Parqueaderos Popayan</h3>
        </div>
    </footer>
</body>

</html>