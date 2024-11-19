<body>

<h1>Лабораторная работа №2: Основы верстки</h1>

<p><strong>Выполнил:</strong> Золотарев Павел</p>
<p><strong>Язык программирования:</strong> Java</p>

<h2>Описание</h2>

<p>Приложение состоит из четырех экранов (Activity) и демонстрирует управление интерфейсом и переходы между экранами.</p>

<h3>Внешний вид</h3>
<ul>
    <li><strong>Экран 1</strong> (MainActivity): 
        <ul>
            <li>Содержит четыре кнопки:</li>
            <li><strong>Кнопка 1:</strong> Переход на Activity2.</li>
            <li><strong>Кнопка 2:</strong> Переход на Activity3.</li>
            <li><strong>Кнопка 3:</strong> Переход на Activity4.</li>
            <li><strong>Кнопка 4:</strong> Завершает приложение.</li>
        </ul>
    </li>
    <li><strong>Экран 2</strong> (Activity2): 
        <ul>
            <li>Содержит кнопки, равномерно распределенные в три строки (всего 7 кнопок).</li>
            <li>Верхняя строка содержит три кнопки.</li>
            <li>Средняя строка содержит две кнопки.</li>
            <li>Нижняя строка содержит три кнопки.</li>
        </ul>
    </li>
    <li><strong>Экран 3</strong> (Activity3): 
        <ul>
            <li>Содержит пять кнопок:</li>
            <li><strong>Верхние кнопки:</strong> "Left 50%" и "Right 50%".</li>
            <li><strong>Средние кнопки:</strong> "Center_left", "Center", "Center_right".</li>
            <li><strong>Нижняя кнопка:</strong> "Bottom".</li>
        </ul>
    </li>
    <li><strong>Экран 4</strong> (Activity4): 
        <ul>
            <li>Содержит одну кнопку, выровненную по центру экрана.</li>
            <li>Цвет обводки: <strong>#505050</strong>.</li>
            <li>Толщина обводки соответствует месяцу рождения.</li>
            <li>Радиус скругления углов: 24dp.</li>
            <li>Фон кнопки: зеленый (обычное состояние) и светло-зеленый (при нажатии).</li>
        </ul>
    </li>
</ul>

<h3>Процесс перехода между экранами</h3>
<ol>
    <li>Пользователь нажимает кнопку на первом экране.</li>
    <li>Создается объект <code>Intent</code>, который указывает на соответствующий экран (Activity2, Activity3 или Activity4).</li>
    <li>Первый экран запускает целевую Activity с помощью метода <code>startActivity(intent)</code>.</li>
</ol>

<p><strong>Код для MainActivity (переход к Activity2):</strong></p>
<pre>
<code>
Button button1 = findViewById(R.id.button1);
button1.setOnClickListener(v -> {
    Intent intent = new Intent(MainActivity.this, Activity2.class);
    startActivity(intent);
});
</code>
</pre>

<p><strong>Код для MainActivity (завершение приложения через кнопку 4):</strong></p>
<pre>
<code>
Button button4 = findViewById(R.id.button4);
button4.setOnClickListener(v -> {
    finish(); // Завершает текущее приложение
});
</code>
</pre>


