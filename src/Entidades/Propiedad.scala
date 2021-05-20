

package Entidades


object Propiedad {
class Propiedades(private var PropertyNo:String, var street:String, private var city:String, private var postcode: String, 
    private var types :String, private var rooms:Byte, private var rent: Integer, private var propietario:String, 
    private var personal:String, private var sucursal:String){
  
}

class PropiedadesExtensas(private var PropertyNo:String, var street:String, private var city:String, private var postcode: String, 
    private var types :String, private var rooms:Byte, private var rent: Integer, private var propietario:String, 
    private var personal:String, private var sucursal:String, private var cliente:String, private var fechavisita:String /*, private var comentario:String*/){}

}