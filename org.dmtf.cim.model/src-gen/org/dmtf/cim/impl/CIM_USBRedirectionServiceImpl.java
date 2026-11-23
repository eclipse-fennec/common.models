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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_USBDevice;
import org.dmtf.cim.CIM_USBRedirectionSAP;
import org.dmtf.cim.CIM_USBRedirectionService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Redirection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_USBRedirectionServiceImpl extends CIM_RedirectionServiceImpl implements CIM_USBRedirectionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBRedirectionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBRedirectionService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateRedirectionSAP(String NewUSBRedirectionSAP, EList<Integer> NewSAPRequestedStatesSupported, EList<CIM_USBDevice> USBDevices, Boolean CreateDevices, EList<String> NewUSBDevices, EList<CIM_LogicalDevice> RedirectedLogicalDevices, String NewRemoteServiceAccessPoint, CIM_USBRedirectionSAP SAP, CIM_ConcreteJob Job) {
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
	public Long DeleteRedirectionSAP(CIM_USBRedirectionSAP SAP, Boolean DeleteUSBDevices, CIM_ConcreteJob Job) {
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
	public Long CreateUSBDevice(String NewUSBDevice, CIM_LogicalDevice RedirectedLogicalDevice, CIM_USBDevice USBDevice, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_USB_REDIRECTION_SERVICE___CREATE_REDIRECTION_SAP__STRING_ELIST_ELIST_BOOLEAN_ELIST_ELIST_STRING_CIM_USBREDIRECTIONSAP_CIM_CONCRETEJOB:
				return CreateRedirectionSAP((String)arguments.get(0), (EList<Integer>)arguments.get(1), (EList<CIM_USBDevice>)arguments.get(2), (Boolean)arguments.get(3), (EList<String>)arguments.get(4), (EList<CIM_LogicalDevice>)arguments.get(5), (String)arguments.get(6), (CIM_USBRedirectionSAP)arguments.get(7), (CIM_ConcreteJob)arguments.get(8));
			case CimPackage.CIM_USB_REDIRECTION_SERVICE___DELETE_REDIRECTION_SAP__CIM_USBREDIRECTIONSAP_BOOLEAN_CIM_CONCRETEJOB:
				return DeleteRedirectionSAP((CIM_USBRedirectionSAP)arguments.get(0), (Boolean)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_USB_REDIRECTION_SERVICE___CREATE_USB_DEVICE__STRING_CIM_LOGICALDEVICE_CIM_USBDEVICE_CIM_CONCRETEJOB:
				return CreateUSBDevice((String)arguments.get(0), (CIM_LogicalDevice)arguments.get(1), (CIM_USBDevice)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_USBRedirectionServiceImpl
