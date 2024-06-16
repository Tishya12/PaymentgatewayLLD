package instrument;

import instrument.Service.InstrumentService;
import instrument.Service.InstrumentServiceFactory;

import java.util.List;

public class InstrumentController {
    InstrumentServiceFactory instrumentServiceFactory = new InstrumentServiceFactory();

    public void addInstrument(InstrumentDO instrument){
        InstrumentService instrumentService = instrumentServiceFactory.getInstrumentService(instrument.getInstrumentType());
        instrumentService.addInstrument(instrument);
    }

    public List<InstrumentDO> getInstrumentByUserId(int userId,  int instrumentId){
        InstrumentService instrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK);
        return instrumentService.getInstrumentByUserId(userId);
    }

    public InstrumentDO getOneInstrumentByUserId(int userId,  int instrumentId){
        InstrumentService instrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK);
        return instrumentService.getOneInstrumentByUserId(userId, instrumentId);
    }
}
