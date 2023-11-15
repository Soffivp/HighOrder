import java.lang.Math
/*val f = (x:Double) => 3.0 * x
def f1(x:Double) = Math.pow(x,3)

///f(a+h) - f(a) / h todo

def fprima(f:Double => Double,x:Int):Double =
  val h = 0.07
  (f(x+h)-f(x))/h

f(3)
f1(6)
fprima(f,3)
fprima(f1,3)
*/
val fa = (a:Double) => - Math.pow(a,2) + 8*a -12
def integracion(a: Double, b: Double,f: (Double) => Double): Double = (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
val media = (a:Double, b:Double) => (a+b)/2
//val fresta = (a:Double, b:Double) => b-a

//val fb = (b:Double) => - Math.pow(b,2) + 8*b -12
//val fx = (a:Double, b:Double) => - (a+b)/2
// la funcion principal recibe una funcion ccon todo anidado y debuelve un double.
//resta:(Double,Double),fa: (Double, Double),fb: (Double, Double),fx: (Double, Double),

//media(3,5)
//fresta(3,5)
//fa
fa(3)
integracion(3,5,fa)