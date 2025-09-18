# Design Task Manager

## Description

There is a task management system that allows users to manage their tasks, each associated with a priority. The system should efficiently handle adding, modifying, executing, and removing tasks.

Implement the TaskManager class:

`TaskManager(vector<vector<int>>& tasks)` initializes the task manager with a list of user-task-priority triples. Each element in the input list is of the form [userId, taskId, priority], which adds a task to the specified user with the given priority.

`void add(int userId, int taskId, int priority)` adds a task with the specified taskId and priority to the user with userId. It is guaranteed that taskId does not exist in the system.

`void edit(int taskId, int newPriority)` updates the priority of the existing taskId to newPriority. It is guaranteed that taskId exists in the system.

`void rmv(int taskId)` removes the task identified by taskId from the system. It is guaranteed that taskId exists in the system.

`int execTop()` executes the task with the highest priority across all users. If there are multiple tasks with the same highest priority, execute the one with the highest taskId. After executing, the taskId is removed from the system. Return the userId associated with the executed task. If no tasks are available, return -1.

Note that a user may be assigned multiple tasks.

## Examples
Input:
["TaskManager", "add", "edit", "execTop", "rmv", "add", "execTop"]
[[[[1, 101, 10], [2, 102, 20], [3, 103, 15]]], [4, 104, 5], [102, 8], [], [101], [5, 105, 15], []]

Output:
[null, null, null, 3, null, null, 5]

Explanation

TaskManager taskManager = new TaskManager([[1, 101, 10], [2, 102, 20], [3, 103, 15]]); // Initializes with three tasks for Users 1, 2, and 3.
taskManager.add(4, 104, 5); // Adds task 104 with priority 5 for User 4.
taskManager.edit(102, 8); // Updates priority of task 102 to 8.
taskManager.execTop(); // return 3. Executes task 103 for User 3.
taskManager.rmv(101); // Removes task 101 from the system.
taskManager.add(5, 105, 15); // Adds task 105 with priority 15 for User 5.
taskManager.execTop(); // return 5. Executes task 105 for User 5.

## Solutions

### Sol1
```
class TaskManager {
    List<List<Integer>> tasks= new ArrayList<>();

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> t: tasks){
            this.tasks.add(new ArrayList<>(t));
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        List<Integer> newTask = new ArrayList<>();
        newTask.add(userId);
        newTask.add(taskId);
        newTask.add(priority);
        tasks.add(newTask);
    }
    
    public void edit(int taskId, int newPriority) {
        for(List<Integer> t: tasks){
            if(t.get(1)==taskId){
                t.set(2, newPriority);
                break;
            }
        }
    }
    
    public void rmv(int taskId) {
        for(int i=0; i<tasks.size(); i++){
            if(tasks.get(i).get(1)==taskId){
                tasks.remove(i);
                break;
            }
        }   
    }
    
    public int execTop() {
        if(tasks.isEmpty()) return -1;
        
        List<Integer> maxTask= tasks.get(0);
        for(int i=1; i<tasks.size(); i++){
            List<Integer> currTask= tasks.get(i);
            if(currTask.get(2)>maxTask.get(2) ||
                  (currTask.get(2)==maxTask.get(2) && currTask.get(1)>maxTask.get(1))){
                maxTask=currTask;
            }
        }
        int userId=maxTask.get(0);
        tasks.remove(maxTask);
        return userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */

```

#### Complexity
