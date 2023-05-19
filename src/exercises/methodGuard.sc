def guard(data: Any, maxLength: Int) = {
  data match {
    case data: List[Any] if data.length <= maxLength => "Задан список List допустимой длины"
    case data: List[Any] if data.length > maxLength => "Длина списка больше максимально допустимого значения"
    case data: String if data.length <= maxLength => "Длина строки не превышает максимально допустимого значения"
    case data: String if data.length > maxLength => "Получена строка недопустимой длины"
    case _ => "Что это? Это не строка и не список"
  }
}

guard("Hello", 5)