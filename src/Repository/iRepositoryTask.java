package Repository;

import Entities.Task;

import java.util.List;

public interface iRepositoryTask {

    public Task criarTask(Task task);
    public void deletarTaskNome(Task task);
    public List<Task> listaTask();


}
