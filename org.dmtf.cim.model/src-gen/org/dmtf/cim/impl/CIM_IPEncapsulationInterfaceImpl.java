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

import org.dmtf.cim.CIM_IPEncapsulationInterface;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Encapsulation Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getCAVRFContext <em>CAVRF Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getCASourceEndpoint <em>CA Source Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getPAVRFContext <em>PAVRF Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPEncapsulationInterfaceImpl#getPASourceEndpoint <em>PA Source Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPEncapsulationInterfaceImpl extends CIM_ManagedSystemElementImpl implements CIM_IPEncapsulationInterface {
	/**
	 * The default value of the '{@link #getEncapsulationMode() <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCAPSULATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulationMode() <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer encapsulationMode = ENCAPSULATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEncapsulationMode() <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENCAPSULATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEncapsulationMode() <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEncapsulationMode = OTHER_ENCAPSULATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCAVRFContext() <em>CAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAVRFContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CAVRF_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCAVRFContext() <em>CAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAVRFContext()
	 * @generated
	 * @ordered
	 */
	protected String cavrfContext = CAVRF_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCASourceEndpoint() <em>CA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASourceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_SOURCE_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASourceEndpoint() <em>CA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASourceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String caSourceEndpoint = CA_SOURCE_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPAVRFContext() <em>PAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAVRFContext()
	 * @generated
	 * @ordered
	 */
	protected static final String PAVRF_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPAVRFContext() <em>PAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAVRFContext()
	 * @generated
	 * @ordered
	 */
	protected String pavrfContext = PAVRF_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPASourceEndpoint() <em>PA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPASourceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String PA_SOURCE_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPASourceEndpoint() <em>PA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPASourceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String paSourceEndpoint = PA_SOURCE_ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPEncapsulationInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPEncapsulationInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncapsulationMode() {
		return encapsulationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulationMode(Integer newEncapsulationMode) {
		Integer oldEncapsulationMode = encapsulationMode;
		encapsulationMode = newEncapsulationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__ENCAPSULATION_MODE, oldEncapsulationMode, encapsulationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEncapsulationMode() {
		return otherEncapsulationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEncapsulationMode(String newOtherEncapsulationMode) {
		String oldOtherEncapsulationMode = otherEncapsulationMode;
		otherEncapsulationMode = newOtherEncapsulationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__OTHER_ENCAPSULATION_MODE, oldOtherEncapsulationMode, otherEncapsulationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCAVRFContext() {
		return cavrfContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCAVRFContext(String newCAVRFContext) {
		String oldCAVRFContext = cavrfContext;
		cavrfContext = newCAVRFContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CAVRF_CONTEXT, oldCAVRFContext, cavrfContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCASourceEndpoint() {
		return caSourceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCASourceEndpoint(String newCASourceEndpoint) {
		String oldCASourceEndpoint = caSourceEndpoint;
		caSourceEndpoint = newCASourceEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CA_SOURCE_ENDPOINT, oldCASourceEndpoint, caSourceEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPAVRFContext() {
		return pavrfContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPAVRFContext(String newPAVRFContext) {
		String oldPAVRFContext = pavrfContext;
		pavrfContext = newPAVRFContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PAVRF_CONTEXT, oldPAVRFContext, pavrfContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPASourceEndpoint() {
		return paSourceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPASourceEndpoint(String newPASourceEndpoint) {
		String oldPASourceEndpoint = paSourceEndpoint;
		paSourceEndpoint = newPASourceEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PA_SOURCE_ENDPOINT, oldPASourceEndpoint, paSourceEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__ENCAPSULATION_MODE:
				return getEncapsulationMode();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__OTHER_ENCAPSULATION_MODE:
				return getOtherEncapsulationMode();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CAVRF_CONTEXT:
				return getCAVRFContext();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CA_SOURCE_ENDPOINT:
				return getCASourceEndpoint();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PAVRF_CONTEXT:
				return getPAVRFContext();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PA_SOURCE_ENDPOINT:
				return getPASourceEndpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__ENCAPSULATION_MODE:
				setEncapsulationMode((Integer)newValue);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__OTHER_ENCAPSULATION_MODE:
				setOtherEncapsulationMode((String)newValue);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CAVRF_CONTEXT:
				setCAVRFContext((String)newValue);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CA_SOURCE_ENDPOINT:
				setCASourceEndpoint((String)newValue);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PAVRF_CONTEXT:
				setPAVRFContext((String)newValue);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PA_SOURCE_ENDPOINT:
				setPASourceEndpoint((String)newValue);
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
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__ENCAPSULATION_MODE:
				setEncapsulationMode(ENCAPSULATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__OTHER_ENCAPSULATION_MODE:
				setOtherEncapsulationMode(OTHER_ENCAPSULATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CAVRF_CONTEXT:
				setCAVRFContext(CAVRF_CONTEXT_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CA_SOURCE_ENDPOINT:
				setCASourceEndpoint(CA_SOURCE_ENDPOINT_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PAVRF_CONTEXT:
				setPAVRFContext(PAVRF_CONTEXT_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PA_SOURCE_ENDPOINT:
				setPASourceEndpoint(PA_SOURCE_ENDPOINT_EDEFAULT);
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
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__ENCAPSULATION_MODE:
				return ENCAPSULATION_MODE_EDEFAULT == null ? encapsulationMode != null : !ENCAPSULATION_MODE_EDEFAULT.equals(encapsulationMode);
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__OTHER_ENCAPSULATION_MODE:
				return OTHER_ENCAPSULATION_MODE_EDEFAULT == null ? otherEncapsulationMode != null : !OTHER_ENCAPSULATION_MODE_EDEFAULT.equals(otherEncapsulationMode);
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CAVRF_CONTEXT:
				return CAVRF_CONTEXT_EDEFAULT == null ? cavrfContext != null : !CAVRF_CONTEXT_EDEFAULT.equals(cavrfContext);
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__CA_SOURCE_ENDPOINT:
				return CA_SOURCE_ENDPOINT_EDEFAULT == null ? caSourceEndpoint != null : !CA_SOURCE_ENDPOINT_EDEFAULT.equals(caSourceEndpoint);
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PAVRF_CONTEXT:
				return PAVRF_CONTEXT_EDEFAULT == null ? pavrfContext != null : !PAVRF_CONTEXT_EDEFAULT.equals(pavrfContext);
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE__PA_SOURCE_ENDPOINT:
				return PA_SOURCE_ENDPOINT_EDEFAULT == null ? paSourceEndpoint != null : !PA_SOURCE_ENDPOINT_EDEFAULT.equals(paSourceEndpoint);
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
		result.append(" (EncapsulationMode: ");
		result.append(encapsulationMode);
		result.append(", OtherEncapsulationMode: ");
		result.append(otherEncapsulationMode);
		result.append(", CAVRFContext: ");
		result.append(cavrfContext);
		result.append(", CASourceEndpoint: ");
		result.append(caSourceEndpoint);
		result.append(", PAVRFContext: ");
		result.append(pavrfContext);
		result.append(", PASourceEndpoint: ");
		result.append(paSourceEndpoint);
		result.append(')');
		return result.toString();
	}

} //CIM_IPEncapsulationInterfaceImpl
