/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqeuadero.transversal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvarodanieleraso
 */
public class CodigoBarras {
    
        
    public void crearPDF(String PrmPlaca, String PrmCodigo){
        
       
            try {
                Document doc =new Document();
                PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("barras.pdf"));
                doc.open();
                
                //generamos el codigo de barras
                //utilizamos cod 29 o cod 128
                
                Barcode39 code =new Barcode39();
                code.setCode(PrmCodigo);
                
                //pasamos este codigo a una imagen
                com.itextpdf.text.Image img  = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
                
                img.scalePercent(300);
                
                
                //agregamos una tabla 
                PdfPTable table = new PdfPTable(1);
                //table.addCell("tiket");
                
                // create cell
                PdfPCell cell = new PdfPCell();
                
                cell.setHorizontalAlignment(40);
                
                
                
                //mensaje de bienvenida
                float fntSize = 30.7f;
                float lineSpacing = 10f;
                Paragraph p = new Paragraph(new Phrase(lineSpacing,"Bienvenido",
                FontFactory.getFont(FontFactory.COURIER, fntSize)));
                p.setAlignment(Element.ALIGN_CENTER);
                
                //mensaje de placa
                float fntSize2 = 20.7f;
                float lineSpacing2 = 10f;
                Paragraph placaTAG = new Paragraph(new Phrase(lineSpacing2,"PLACA: "+ PrmPlaca,
                FontFactory.getFont(FontFactory.COURIER_BOLD, fntSize2)));
                placaTAG.setAlignment(Element.ALIGN_CENTER);
                
                
                cell.addElement(new Paragraph(" "));
                cell.addElement(p);
                cell.addElement(new Paragraph(" "));
                cell.addElement(new Paragraph(" "));
                
                cell.addElement(placaTAG);
                
                
                img.setAlignment(Element.ALIGN_CENTER);
                cell.addElement(img);
                
                table.addCell(cell);
                
                doc.add(table);
              
                doc.close();
                
                
            } catch (DocumentException ex) {
                Logger.getLogger(CodigoBarras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
            Logger.getLogger(CodigoBarras.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
   
    
    
}
