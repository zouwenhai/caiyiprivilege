package nirvana.cash.loan.privilege.common.util.poi.convert;

import nirvana.cash.loan.privilege.common.util.DateUtil;

public class TimeConvert implements ExportConvert {

	@Override
	public String handler(Object val) {
		try {
			if (val == null)
				return "";
			else {
				return DateUtil.formatCSTTime(val.toString(), "yyyy-MM-dd HH:mm:ss");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

}
