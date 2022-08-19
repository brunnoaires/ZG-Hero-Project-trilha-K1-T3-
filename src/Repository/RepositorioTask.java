package Repository;

import Entities.Task;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTask implements iRepositoryTask{

    List<Task> taskList = new ArrayList<Task>();

    @Override
    public Task criarTask(Task task) {

        listaTask().add(task);

     return null;
    }

    @Override
    public void  deletarTaskNome(Task task) {

    }

    @Override
    public List<Task> listaTask() {
        return null;
    }
}
