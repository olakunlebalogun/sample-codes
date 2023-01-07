package src.read.write.excel.functional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // name  age occupation
        Worker wk = new Worker("Olakunle", 12, "developer");

//        wk.setName("olaoluwa");
        System.out.println(wk);

        List<WorkerDTO> workerDTOList = new ArrayList<>();
//        WorkerDTO workerDTO = new WorkerDTO();
        /**
         * Declaring the above object here will have the iteration return the same object
         * because it has the same reference, so it is like storing the same object repeatedly in the
         * list, so to do it CORRECTLY, the object should be created in the Array.
         */
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Ajede", 11, "Frontend Developer"));
        workerList.add(new Worker("Olasunkanmi", 12, "Backend Developer"));
        workerList.add(new Worker("Johnson", 13, "Frontend Developer"));
        workerList.add(new Worker("Phillip", 14, "Mobile Developer"));
        workerList.add(new Worker("Jide", 15, "Senior Developer"));
        workerList.add(new Worker("Dayo", 16, "CEO"));
        System.out.println(workerList);

        for (Worker i : workerList) {
            WorkerDTO workerDTO = new WorkerDTO();


            workerDTO.setName(i.getName());
            workerDTO.setAge(i.getAge());
            System.out.println(workerDTO);

            workerDTOList.add(workerDTO);
        }
        System.out.println(workerDTOList);


        workerList.stream().forEach(i -> System.out.println(i.getName()));

    }
}
