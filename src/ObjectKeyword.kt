fun main() {

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()
    
}

object SharingWidget{

     private var twitterLikes=0
     private var fblikes=0

     fun incrementTwitterLikes()= twitterLikes++
     fun incrementFBLikes()= fblikes++
     fun display()= println("Facebook - $fblikes -- Twitter -- $twitterLikes")


}


//No constructors are allowed (init block is allowed)
//Singleton pattern
//Objects can inherit class/interface