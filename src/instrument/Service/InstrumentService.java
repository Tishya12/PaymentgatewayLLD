package instrument.Service;

import User.User;
import instrument.Instrument;
import instrument.InstrumentDO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {

    Map<Integer, List<Instrument>> userInstruments = new HashMap<>();

    public abstract void addInstrument(InstrumentDO instrument);

    public abstract List<InstrumentDO> getInstrumentByUserId(int userId);

    public abstract InstrumentDO getOneInstrumentByUserId(int userId, int instrumentId);
}
