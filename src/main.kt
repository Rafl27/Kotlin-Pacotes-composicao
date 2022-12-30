import br.com.alura.teste.testaAutenticacao
import br.com.alura.teste.testaContasDiferentes

fun main() {
//    testaAutenticacao()
//    testaContasDiferentes()

    //object expression test
//    val rafael = object {
//        val nome: String = "Rafael"
//        val idade : Int = 12
//
//        fun welcome () : String {
//            return "Welcome $nome $idade"
//        }
//    }
//    print(rafael.welcome())

    //testing any?
    fun whatever(value: Any) : Any {
        return value;
    }
    print(whatever("hello"))
    print(whatever(12))



}