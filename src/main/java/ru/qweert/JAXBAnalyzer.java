package ru.qweert;

import ru.qweert.martha.Application;
import ru.qweert.martha.Good;
import ru.qweert.martha.GoodType;

import javax.xml.bind.*;
import java.io.File;
import java.math.BigInteger;

public class JAXBAnalyzer {

  public static void main(String[] args) {
    JAXBContext context;
    try {
      context = JAXBContext.newInstance("ru.qweert.martha");
      Unmarshaller unmarshaller = context.createUnmarshaller();
      unmarshaller.setEventHandler(new ErrorHandler());
      Application application = (Application)unmarshaller.unmarshal(JAXBAnalyzer.class.getClassLoader().getResourceAsStream("application.xml"));
      //выводим всё в html. Реализавция вывода в html находится в методе toString() классов - сущностей
      System.out.println(application);

      Good washingMachine = new Good();
      washingMachine.setGoodType(GoodType.БЫТОВАЯ_ТЕХНИКА);
      washingMachine.setName("Стиральная машина");
      washingMachine.setCost(35000);
      washingMachine.setQuantity(BigInteger.ONE);
      application.getGoods().getGood().add(washingMachine);

      Marshaller marshaller = context.createMarshaller();
      marshaller.setEventHandler(new ErrorHandler());
      //выводим получившееся дерево объектов в xml файл.
      marshaller.marshal(application, new File("src/main/resources/result.xml"));
    } catch (MarshalException e) {
      System.exit(0);
    } catch (UnmarshalException e) {
      System.exit(0);
    } catch (JAXBException ex) {
      ex.printStackTrace();
    }
  }
}
