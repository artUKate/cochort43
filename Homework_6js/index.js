function addTask() {
    var taskInput = document.getElementById("new-task");
    var taskText = taskInput.value.trim();
    if (taskText !== "") {
        var tasksList = document.getElementById("tasks");
        var taskItem = document.createElement("li");
        taskItem.textContent = taskText;
        taskItem.classList.add("todo-item");
        taskItem.onclick = function() {
            this.classList.toggle("completed");
        };
        tasksList.appendChild(taskItem);
        taskInput.value = "";
    } else {
        alert("Введите текст задания!");
    }
}