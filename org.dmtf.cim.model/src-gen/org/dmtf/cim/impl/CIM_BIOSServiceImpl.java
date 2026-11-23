/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_BIOSElement;
import org.dmtf.cim.CIM_BIOSService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_BIOSServiceImpl extends CIM_ServiceImpl implements CIM_BIOSService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetBIOSAttribute(CIM_BIOSElement TargetBIOS, String AttributeName, EList<String> AttributeValue, String AuthorizationToken, Long PasswordEncoding, Long SetResult) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetBIOSAttributeEmbeddedInstance(CIM_BIOSElement TargetBIOS, String AttributeConfig, String AuthorizationToken, Long PasswordEncoding, Long SetResult) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ReadRawBIOSData(CIM_BIOSElement TargetBIOS, Long Offset, Long NumberOfBytes, EList<Integer> Data) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long WriteRawBIOSData(CIM_BIOSElement TargetBIOS, Long Offset, Long NumberOfBytes, EList<Integer> Data, String AuthorizationToken, Long PasswordEncoding) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetBIOSAttributes(CIM_BIOSElement TargetBIOS, String CollectionElementName, EList<String> AttributeName, EList<String> AttributeValue, String AuthorizationToken, Long PasswordEncoding, EList<Long> SetResult) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_BIOS_SERVICE___SET_BIOS_ATTRIBUTE__CIM_BIOSELEMENT_STRING_ELIST_STRING_LONG_LONG:
				return SetBIOSAttribute((CIM_BIOSElement)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (String)arguments.get(3), (Long)arguments.get(4), (Long)arguments.get(5));
			case CimPackage.CIM_BIOS_SERVICE___SET_BIOS_ATTRIBUTE_EMBEDDED_INSTANCE__CIM_BIOSELEMENT_STRING_STRING_LONG_LONG:
				return SetBIOSAttributeEmbeddedInstance((CIM_BIOSElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4));
			case CimPackage.CIM_BIOS_SERVICE___READ_RAW_BIOS_DATA__CIM_BIOSELEMENT_LONG_LONG_ELIST:
				return ReadRawBIOSData((CIM_BIOSElement)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (EList<Integer>)arguments.get(3));
			case CimPackage.CIM_BIOS_SERVICE___WRITE_RAW_BIOS_DATA__CIM_BIOSELEMENT_LONG_LONG_ELIST_STRING_LONG:
				return WriteRawBIOSData((CIM_BIOSElement)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (EList<Integer>)arguments.get(3), (String)arguments.get(4), (Long)arguments.get(5));
			case CimPackage.CIM_BIOS_SERVICE___SET_BIOS_ATTRIBUTES__CIM_BIOSELEMENT_STRING_ELIST_ELIST_STRING_LONG_ELIST:
				return SetBIOSAttributes((CIM_BIOSElement)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (String)arguments.get(4), (Long)arguments.get(5), (EList<Long>)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_BIOSServiceImpl
