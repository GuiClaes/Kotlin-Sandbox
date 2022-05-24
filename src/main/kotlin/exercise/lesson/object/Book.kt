package exercise.lesson.`object`

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("EditorName")
    }
}

class Editor(val editorName: String) {

}