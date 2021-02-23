package io.rivigo.Truck.Scheduling.Service;

import java.util.List;

public interface AppService <C> {

    public List<C> getAllTrucks() ;

    public void add(C type);

    public void update(int id, C type);

    public void delete(int id) ;
}
