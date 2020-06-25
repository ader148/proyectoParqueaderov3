package com.unicauca.parqeuadero.transversal;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author libardo
 */
public class Utilitarios {


    /**
     * Transforma una fecha de String a Date
     *
     * @param strFecha fecha en formato String
     * @return Fecha en formato Date
     */
    public static Date stringToDate(String strFecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {

            ex.printStackTrace();
            return null;
        }
        return fecha;
    }

    /**
     * Determinar si fecha1 es posterior o igual a fecha 2
     *
     * @param fecha1 fecha 1
     * @param fecha2 fecha 2
     * @return true si fecha1 es posterior o igual a fecha2, false en caso
     * contrario
     */
    public static boolean fechaEsPosterior(Date fecha1, Date fecha2) {
        Calendar calFecha1 = dateToCalendar(fecha1);
        Calendar calFecha2 = dateToCalendar(fecha2);

        if (calFecha1.getTimeInMillis() >= calFecha2.getTimeInMillis()) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Evalua si fecha está dentro de fecha1 y fecha2
     *
     * @param fecha fecha a examinar
     * @param fecha1 rango 1
     * @param fecha2 rango 2
     * @return true si está en ese rango, false si no
     */
    public static boolean fechaEstaDentroDe(Date fecha, Date fecha1, Date fecha2) {

        Calendar calFecha = dateToCalendar(fecha);
        Calendar calFecha1 = dateToCalendar(fecha1);
        Calendar calFecha2 = dateToCalendar(fecha2);

        if (calFecha.getTimeInMillis() >= calFecha1.getTimeInMillis() && calFecha.getTimeInMillis() < calFecha2.getTimeInMillis()) {
            return true;
        } else {
            return false;
        }

    }

    public static Calendar dateToCalendar(Date fecha) {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        return cal;
    }

    /**
     * Suma un mes a una fecha
     *
     * @param fecha fecha a la cual se le va a sumar un mes
     * @return la fecha incrementada en un mes
     */
    public static Date sumarMesAFecha(Date fecha) {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        //Le suma un mes
        cal.add(Calendar.MONTH, 1);
        //SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd yyyy");
        //return sdf.format(cal.getTime());
        return cal.getTime();
    }

    /**
     * Suma una cantidad de dias a una fecha
     *
     * @param fecha fecha a ser sumada
     * @param dias cantidad de dias a sumar
     * @return fecha incrementada en unas horas
     */
    public static Date sumarDiasAFecha(Date fecha, int dias) {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        //Le suma los dias
        cal.add(Calendar.DAY_OF_MONTH, dias+1);
        //SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd yyyy");
        //return sdf.format(cal.getTime());
        return cal.getTime();
    }

    /**
     * Suma una cantidad de horas a una fecha
     *
     * @param fecha fecha a ser sumada
     * @param horas cantidad de horas a sumar
     * @return fecha incrementada en unas horas
     */
    public static Date sumarHorasAFecha(Date fecha, int horas) {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        //Le suma un mes
        cal.add(Calendar.HOUR_OF_DAY, horas);
        //SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd yyyy");
        //return sdf.format(cal.getTime());
        return cal.getTime();
    }

    /**
     * Quita la hora a una fecha y la deja en formato yyyy-MM-dd 00:00:00
     *
     * @param fecha fecha a la cual se le va a quitar la hora
     * @return fecha sin hora
     * @throws ParseException
     */
    public static Date quitarHoraAFecha(Date fecha) throws ParseException {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        String fechaStr = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d");
        return sdf.parse(fechaStr);
    }

    /**
     * Devuelve el número total de minutos que hay entre las dos fechas
     *
     * @param fechaInicial fecha 1
     * @param fechaFinal fecha 2
     * @return Minutos que hay entre fechaFinal - fechaInicial
     */
    public static long calcularDiferenciaEnMinutos(Date fechaInicial, Date fechaFinal) {
        Calendar calFechaInicial = dateToCalendar(fechaInicial);
        Calendar calFechaFinal = dateToCalendar(fechaFinal);
        long totalMinutos = ((calFechaFinal.getTimeInMillis() - calFechaInicial.getTimeInMillis()) / 1000 / 60);
        return totalMinutos;
    }

    /**
     * Da formato de moneda a un número. Sirve para los reportes, darles
     * claridad en las cifras
     *
     * @param valor valor a ser formateado
     * @return número con formato moneda
     */
    public static String formatoMoneda(long valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return nf.format(valor);
    }

    /**
     * Da formato "dd/MM/yyyy" a una fechaHora
     *
     * @param fecha fechaHora ser formateada
     * @return fechaHora formateada
     */
    public static String formatoFecha(Date fecha) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        return formatDate.format(fecha);
    }

    /**
     * Da formato "dd-MM-yyyy hh:mm a" a una fechaHora
     *
     * @param fecha fechaHora ser formateada
     * @return fechaHora formateada
     */
    public static String formatoFechaHora(Date fecha) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
        return formatDate.format(fecha);
    }

    /**
     * Pone en mayúsculas la primera letra de una frase
     *
     * @param text texto ser capitalizado
     * @return texto capitalizado
     */
    public static String capitalize(String text) {
        if (!text.isEmpty()) {
            StringBuffer sbt = new StringBuffer();
            String[] partialText = text.split(" ");
            for (int i = 0; i < partialText.length; i++) {
                if (!partialText[i].equals("")) {

                    if (partialText[i].contains("-")) { //composite words
                        sbt.append(capitalizeWithLine(partialText[i]));
                    } else {
                        sbt.append(capitalizeWord(partialText[i]));
                        sbt.append(" ");
                    }
                }
            }
            return sbt.toString().trim(); //only for entire phrase
        }
        return text;
    }

    /**
     * Método privado utilizado por capitalize(String text)
     *
     * @param word
     * @return
     */
    private static String capitalizeWord(String word) {
        if (!word.isEmpty()) {
            StringBuffer sb = new StringBuffer();
            sb.append(String.valueOf(word.charAt(0)).toUpperCase());

            if (word.length() >= 2) {
                sb.append(word.substring(1).toLowerCase());
            }

            return sb.toString();
        }
        return word;
    }

    /**
     * Método privado utilizado por capitalize(String text)
     *
     * @param word
     * @return
     */
    private static String capitalizeWithLine(String wordWithLine) {
        StringBuffer res = new StringBuffer();
        String[] partialTextWithLine = wordWithLine.split("-");
        for (int r = 0; r < partialTextWithLine.length; r++) {
            res.append(capitalizeWord(partialTextWithLine[r]));
            if (r + 1 < partialTextWithLine.length) //not append to end
            {
                res.append("-");
            }
        }
        return res.toString();
    }

    /**
     * Examina si una cadena es numérico
     *
     * @param cadena cadena a ser evaluada
     * @return true si es numérico, false en caso contrario
     */
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Extrae el identificador de una cadena, Ej, "3 Vehiculo" devuelve el 3
     *
     * @param cadena cadena a ser procesada
     * @return el identificador
     */
    public static String extraerId(String cadena) {
        String[] parts = cadena.split(" ");
        String id = parts[0];
        return (id.substring(1, id.length() - 1));
    }

    public static int redondearCentenaProxima(int valor) {
        return (int) (Math.ceil(valor / 100.0)) * 100;
    }
    
    public int generarcodigoTicket(){
        
        //generamos el codigo del ticket con la fecha horas y minutos para que sea unico
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date = sdf.format(new Date()); 
        //quitamos los caracteres del string para dejar solo numeros
        
        String s1="javatpoint is a very good website";  
        String replaceString=date.replace('/','1');
        String replaceString2=replaceString.replace(' ','2');
        String replaceString3=replaceString2.replace(':','3');
        
        //invertimos la cadena para que tome los segundos y la cortamos 
        StringBuilder builder=new StringBuilder(replaceString3);
        String sCadenaInvertida=builder.reverse().toString();
        
        //cortamos la cadena por que no alcanza en el entero
        String sSubCadena = sCadenaInvertida.substring(0,6);
        
        
        int i=Integer.parseInt(sSubCadena);  
        
        //System.out.println("este es el codigo entero");
        //System.out.println(i);
        return i;
    }
}