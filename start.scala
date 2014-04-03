
import scala.util.matching.Regex

var factory = new matlabcontrol.MatlabProxyFactory();

// def startMatlab() : matlabcontrol.MatlabProxy = {
// 	var factory = new matlabcontrol.MatlabProxyFactory();
// 	var proxy = factory.getProxy();
// 	return proxy;
// }

var matlab = factory.getProxy();

def executeMatlabQuery(l: String){
	println(l)
	if(!matlab.isConnected())
	{
		matlab = factory.getProxy();
	}
	matlab.eval(l);
}

// def chart(){sub.chart()}

// def addSetServer(s: String) {
// 	println(s)
// 	var p = "/\\s(.+):(.+):(\\d{1,4}):(.*):(.*)".r;
// 	var r = p.findFirstMatchIn(s).get;
// 	var ss = new studio.kdb.Server();
// 	ss.setName(r.group(1));
// 	ss.setHost(r.group(2));
// 	ss.setPort(Integer.parseInt(r.group(3)));
// 	ss.setUsername(r.group(4));
// 	ss.setPassword(r.group(5));
// 	ss.setAuthenticationMechanism("Username and password");
// 	sub.addServer(ss);
// 	sub.setServer(ss);
// }