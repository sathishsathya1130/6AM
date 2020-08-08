package com.sathish.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SsnGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String preffix="SSN";
		String suffix = " ";
		
		try {
			Connection con = session.connection();
			Statement stmt = con.createStatement();

			String sql = "select ssn_id_seq.nextval from Dual";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int seqval = rs.getInt(1);
				suffix = String.valueOf(seqval);
				System.out.println(suffix);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return preffix+suffix;
	}

}
