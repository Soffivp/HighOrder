import java.lang.Math

//Funcion base y Ejercicio1
/*val fx = (a:Double) => - Math.pow(a,2) + 8*a -12
 def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(3)
integracion(3,5,fx)
def errorAprox ( vobt: Double): Double =
  val vesp = 7.33
  (vesp - vobt ).abs

errorAprox(integracion(3,5,fx))

*/
//Ejercicio 2
/*val fx = (a:Double) => Math.pow(a,2) * 3
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(0)
integracion(0,2,fx)

def errorAprox ( vobt: Double): Double =
  val vesp = 8
  (vesp - vobt ).abs

errorAprox(integracion(0,2,fx))
*/

//Ejercicio 3
/*val fx = (a:Double) => a + 2 * Math.pow(a,2) - Math.pow(a,3) + 5 * Math.pow(a,4)
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(-1)
integracion(-1,1,fx)

def errorAprox ( vobt: Double): Double =
  val vesp = 3.333
  (vesp - vobt ).abs

errorAprox(integracion(-1,1,fx))*/

//Ejercicio 4
/*val fx = (a:Double) => (2 * a + 1)/ ( Math.pow(a,2) + a)
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(1)
integracion(1,2,fx)
def errorAprox ( vobt: Double): Double =
  val vesp = 1.09861
  (vesp - vobt ).abs

errorAprox(integracion(1,2,fx))

*/

//Ejercicio 5
/*val fx = (a:Double) => scala.math.exp(a)
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(1)
integracion(0,1,fx)

def errorAprox ( vobt: Double): Double =
  val vesp = 1.71828
  (vesp - vobt ).abs

errorAprox(integracion(0,1,fx))


*/
//Ejercicio 6
/*val fx = (a:Double) => 1 /  Math.sqrt(a-1)
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(2)
integracion(2,3,fx)

def errorAprox ( vobt: Double): Double =
  val vesp = 0.828427
  (vesp - vobt ).abs


errorAprox(integracion(2,3,fx))
*/
//Ejercicio 7
val fx = (a:Double) => 1 /  (1 + Math.pow(a,2))
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
fx(0)
integracion(0,1,fx)

def errorAprox ( vobt: Double): Double =
  val vesp = 0.785398
  (vesp - vobt ).abs

errorAprox(integracion(0,1,fx))