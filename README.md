# Практична робота: Реалізація успадкування

Цей репозиторій містить приклад виконання практичної роботи з теми **успадкування в Java**.

## 🔍 Мета роботи
Ознайомитися з принципами **успадкування** у Java. Навчитися створювати UML-діаграми класів, реалізовувати їх у коді.

---

## 🐹 Обрана тварина: **Хом’як**

Для реалізації завдання було обрано тварину — **хом’яка**.
Хом’яки — це маленькі гризуни, які:
- бігають у колесі,
- зберігають їжу за щоками,
- видають звуки.

### Фото джунгарського хом'яка
![Hamster](https://github.com/ppc-ntu-khpi/inheritance-Diassont/blob/master/images/Hamster.jpg?raw=true)

---

## 🧩 Ієрархія класів

- `Animal` — базовий клас з основними характеристиками і методами всіх тварин.
- `Hamster` — підклас, який наслідує `Animal` і додає унікальну поведінку хом’яка.
- `TestAnimal` — тестовий клас, який створює об'єкт `Hamster` і викликає його методи.

---

## 🖼️ UML-діаграма

Діаграма класів була створена за допомогою **StarUML**.
Вона демонструє ієрархію класів та відношення між ними:

![UML діаграма](https://github.com/ppc-ntu-khpi/inheritance-Diassont/blob/master/images/Hamster%20Class%20Diagram.png?raw=true)

---

## 💻 Результат роботи програми

При запуску тестового класу `TestAnimal`, програма виводить наступний результат:

![Result](https://github.com/ppc-ntu-khpi/inheritance-Diassont/blob/master/images/Result.png?raw=true)

---
## 📝 Висновок

У цій практичній роботі було розглянуто принципи успадкування в Java. Створено UML-діаграму класів для хом’яка та реалізовано її у коді. Програма успішно демонструє поведінку хом’яка, використовуючи механізми успадкування.
