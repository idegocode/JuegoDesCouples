/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegodescouples;
/**
 *
 * @author diego
 */
//clase preguntas
public class Preguntas {
    //atributos de la clase
   public String titulopre; 
   public String contenidopre;

//constructor preguntas sin parametros
    public Preguntas()
    {
        this.titulopre = "titulo pregunta";
        this.contenidopre ="¿el texto corresponde con la figura gemometrica?";
    }    
//constructor preguntas con parametros
    public Preguntas(String titulopre, String contenidopre)
    {
        this.titulopre = titulopre;
        this.contenidopre = contenidopre;
    }
}



