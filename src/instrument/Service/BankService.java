package instrument.Service;

import instrument.BankInstrument;
import instrument.Instrument;
import instrument.InstrumentDO;
import instrument.InstrumentType;

import java.util.ArrayList;
import java.util.List;

public class BankService extends InstrumentService {
    @Override
    public void addInstrument(InstrumentDO instrumentDO) {
        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.setInstrumentId(instrumentDO.getInstrumentId());
        bankInstrument.setUserId(instrumentDO.getUserId());
        bankInstrument.setBankAccNo(instrumentDO.getBankAccNo());
        bankInstrument.setIfscCode(instrumentDO.getIfscCode());
        bankInstrument.setInstrumentType(InstrumentType.BANK);

        List<Instrument> instruments = userInstruments.get(instrumentDO.getUserId());
        if (instruments == null) {
            instruments = new ArrayList<>();
            userInstruments.put(instrumentDO.getUserId(), instruments);
        }
        instruments.add(bankInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserId(int userId) {
        if (userInstruments.containsKey(userId)) {
            List<Instrument> list = userInstruments.get(userId);
            List<InstrumentDO> instrumentDOS = new ArrayList<>();
            for (Instrument instrument : list) {
                InstrumentDO instrumentDO = convertInstrumentToInstrumentDO((BankInstrument)instrument);
                instrumentDOS.add(instrumentDO);
            }
            return instrumentDOS;
        } else return null;
    }

    @Override
    public InstrumentDO getOneInstrumentByUserId(int userId,int instrumentId) {
        //match the userid and instrumentid in the list and return it
        return null;
    }

    public InstrumentDO convertInstrumentToInstrumentDO(BankInstrument instrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setBankAccNo(instrument.getBankAccNo());
        instrumentDO.setInstrumentId(instrument.getInstrumentId());
        //setting all necessary details
        return instrumentDO;
    }


}
