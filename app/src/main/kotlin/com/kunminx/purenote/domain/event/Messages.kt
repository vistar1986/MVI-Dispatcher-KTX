package com.kunminx.purenote.domain.event

/**
 * Create by KunMinX at 2022/6/16
 */
sealed class Messages {
  object RefreshNoteList : Messages()
  object FinishActivity : Messages()
}
