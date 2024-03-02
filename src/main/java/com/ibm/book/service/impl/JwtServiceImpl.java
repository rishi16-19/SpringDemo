package com.ibm.book.service.impl;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.ibm.book.entity.User;
import com.ibm.book.service.JwtService;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtServiceImpl implements JwtService {
	
	
	 private final String secretKey="9a4f2c8d3b7a1e6f45c8a0b3f267d8b1d4e6f3c8a9d2b5f8e3a9c8b5f6v8a3d9" ;

//	    public JwtServiceImpl(@Value("${secret}") String secretKey) {
//	        this.secretKey = secretKey;
//	    }
	
	@Override
	public boolean isTokenValid(String token, User user) {
		return false;
	}

	@Override
	public String extractUsername(String token) {
		return null;
	}

	@Override
	public String generateToken(Map<String, Object> extraClaims,String userName) {
		return Jwts.builder()
				.addClaims(extraClaims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1*60*1000 ))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
	}
	
	
	private Key getSignInKey() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
    }

	

}
