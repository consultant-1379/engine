/**
 * 
 */
package com.distocraft.dc5000.etl.engine.main.engineadmincommands;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.distocraft.dc5000.etl.engine.main.EngineAdmin;


/**
 * @author eheijun
 *
 */
public class ReloadAlarmCacheCommand extends Command {

  public ReloadAlarmCacheCommand(final String[] args) {
    super(args);
  }

  /* (non-Javadoc)
   * @see com.distocraft.dc5000.etl.engine.main.engineadmincommands.Command#checkAndConvertArgumentTypes()
   */
  @Override
  void checkAndConvertArgumentTypes() throws InvalidArgumentsException {
    //nothing to do
  }

  /* (non-Javadoc)
   * @see com.distocraft.dc5000.etl.engine.main.engineadmincommands.Command#getUsageMessage()
   */
  @Override
  String getUsageMessage() {
    return "reloadAlarmCache";
  }

  /* (non-Javadoc)
   * @see com.distocraft.dc5000.etl.engine.main.engineadmincommands.Command#performCommand()
   */
  @Override
  public void performCommand() throws NotBoundException,MalformedURLException,RemoteException {
    final EngineAdmin admin = createNewEngineAdmin();
    admin.reloadAlarmConfigCache();
  }

  /* (non-Javadoc)
   * @see com.distocraft.dc5000.etl.engine.main.engineadmincommands.Command#getCorrectArgumentsLength()
   */
  @Override
  protected int getCorrectArgumentsLength() {
    return 1;
  }

}
