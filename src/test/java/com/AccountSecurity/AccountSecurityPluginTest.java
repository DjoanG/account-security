package com.AccountSecurity;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AccountSecurityPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AccountSecurityPlugin.class);
		RuneLite.main(args);
	}
}