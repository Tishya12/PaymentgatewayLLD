package instrument.Service;

import instrument.InstrumentType;

public class InstrumentServiceFactory {

    public InstrumentService getInstrumentService(InstrumentType instrumentType){
        if (instrumentType.equals("BANK")){
            return new BankService();
        } else return new CardService();
    }
}
