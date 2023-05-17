sealed trait Message
case class PlaySong(name: String) extends Message
case class IncreaseVolume(amount: Int) extends Message
case class DecreaseVolume(amount: Int) extends Message
case object StopPlaying extends Message

def handleMessages(message: Message): Unit = message match
  case PlaySong(name)         => playSong(name)
  case IncreaseVolume(amount) => changeVolume(amount)
  case DecreaseVolume(amount) => changeVolume(-amount)
  case StopPlaying            => stopPlayingSong()