package UserListener

import android.view.View
import java.text.FieldPosition

interface UserItemListenner {
    fun onListItemClick(view: View, position: Int)
}