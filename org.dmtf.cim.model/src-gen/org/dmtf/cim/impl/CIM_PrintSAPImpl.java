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

import java.util.Collection;

import org.dmtf.cim.CIM_PrintSAP;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print SAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSAPImpl#getPrintProtocol <em>Print Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSAPImpl#getPrintProtocolInfo <em>Print Protocol Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintSAPImpl extends CIM_ServiceAccessPointImpl implements CIM_PrintSAP {
	/**
	 * The cached value of the '{@link #getPrintProtocol() <em>Print Protocol</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> printProtocol;

	/**
	 * The cached value of the '{@link #getPrintProtocolInfo() <em>Print Protocol Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintProtocolInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> printProtocolInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintSAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintSAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPrintProtocol() {
		if (printProtocol == null) {
			printProtocol = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL);
		}
		return printProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPrintProtocolInfo() {
		if (printProtocolInfo == null) {
			printProtocolInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL_INFO);
		}
		return printProtocolInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL:
				return getPrintProtocol();
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL_INFO:
				return getPrintProtocolInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL:
				getPrintProtocol().clear();
				getPrintProtocol().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL_INFO:
				getPrintProtocolInfo().clear();
				getPrintProtocolInfo().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL:
				getPrintProtocol().clear();
				return;
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL_INFO:
				getPrintProtocolInfo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL:
				return printProtocol != null && !printProtocol.isEmpty();
			case CimPackage.CIM_PRINT_SAP__PRINT_PROTOCOL_INFO:
				return printProtocolInfo != null && !printProtocolInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (PrintProtocol: ");
		result.append(printProtocol);
		result.append(", PrintProtocolInfo: ");
		result.append(printProtocolInfo);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintSAPImpl
