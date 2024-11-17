/**
 * 4.3.2 Use of Multiple Source Files
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * para compilar varios archivos podemos hacer en el caso
         * anterior, habiendo los dos archivos:
         * Employee.java
         * EmployeeTest.java
         * usando la sentencia:
         * javac Employee*.java
         * es un wildcard ya que compila los dos archivos
         * pero si compliabamos solo el EmployeeTest.java
         * iba a pasar lo mismo porque iba a encontrar la clase
         * Employee y no iba a saber donde sacarla y busca en el mismo
         * directorio y encuentra un archivo que se llama asi y contiene
         * una clase. y lo termina compilando de la misma manera.
         */
    }
}
