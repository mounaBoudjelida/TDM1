package app.youcef.com.stock2.Model

/**
 * Created by hp on 19/04/2018.
 */
class Filme(val title:String, val photo:String, val salle : String?,val id:Int) {
    override fun toString(): String {
        return title
    }
}