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

import org.dmtf.cim.CIM_KerberosCredential;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Kerberos Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_KerberosCredentialImpl#getAccessesService <em>Accesses Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_KerberosCredentialImpl#getRemoteID <em>Remote ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_KerberosCredentialImpl#getTicketType <em>Ticket Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_KerberosCredentialImpl extends CIM_CredentialImpl implements CIM_KerberosCredential {
	/**
	 * The default value of the '{@link #getAccessesService() <em>Accesses Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesService()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSES_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessesService() <em>Accesses Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesService()
	 * @generated
	 * @ordered
	 */
	protected String accessesService = ACCESSES_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteID() <em>Remote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteID()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteID() <em>Remote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteID()
	 * @generated
	 * @ordered
	 */
	protected String remoteID = REMOTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTicketType() <em>Ticket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TICKET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTicketType() <em>Ticket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketType()
	 * @generated
	 * @ordered
	 */
	protected Integer ticketType = TICKET_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_KerberosCredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_KerberosCredential();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessesService() {
		return accessesService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessesService(String newAccessesService) {
		String oldAccessesService = accessesService;
		accessesService = newAccessesService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KERBEROS_CREDENTIAL__ACCESSES_SERVICE, oldAccessesService, accessesService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoteID() {
		return remoteID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteID(String newRemoteID) {
		String oldRemoteID = remoteID;
		remoteID = newRemoteID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KERBEROS_CREDENTIAL__REMOTE_ID, oldRemoteID, remoteID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTicketType() {
		return ticketType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicketType(Integer newTicketType) {
		Integer oldTicketType = ticketType;
		ticketType = newTicketType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KERBEROS_CREDENTIAL__TICKET_TYPE, oldTicketType, ticketType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_KERBEROS_CREDENTIAL__ACCESSES_SERVICE:
				return getAccessesService();
			case CimPackage.CIM_KERBEROS_CREDENTIAL__REMOTE_ID:
				return getRemoteID();
			case CimPackage.CIM_KERBEROS_CREDENTIAL__TICKET_TYPE:
				return getTicketType();
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
			case CimPackage.CIM_KERBEROS_CREDENTIAL__ACCESSES_SERVICE:
				setAccessesService((String)newValue);
				return;
			case CimPackage.CIM_KERBEROS_CREDENTIAL__REMOTE_ID:
				setRemoteID((String)newValue);
				return;
			case CimPackage.CIM_KERBEROS_CREDENTIAL__TICKET_TYPE:
				setTicketType((Integer)newValue);
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
			case CimPackage.CIM_KERBEROS_CREDENTIAL__ACCESSES_SERVICE:
				setAccessesService(ACCESSES_SERVICE_EDEFAULT);
				return;
			case CimPackage.CIM_KERBEROS_CREDENTIAL__REMOTE_ID:
				setRemoteID(REMOTE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_KERBEROS_CREDENTIAL__TICKET_TYPE:
				setTicketType(TICKET_TYPE_EDEFAULT);
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
			case CimPackage.CIM_KERBEROS_CREDENTIAL__ACCESSES_SERVICE:
				return ACCESSES_SERVICE_EDEFAULT == null ? accessesService != null : !ACCESSES_SERVICE_EDEFAULT.equals(accessesService);
			case CimPackage.CIM_KERBEROS_CREDENTIAL__REMOTE_ID:
				return REMOTE_ID_EDEFAULT == null ? remoteID != null : !REMOTE_ID_EDEFAULT.equals(remoteID);
			case CimPackage.CIM_KERBEROS_CREDENTIAL__TICKET_TYPE:
				return TICKET_TYPE_EDEFAULT == null ? ticketType != null : !TICKET_TYPE_EDEFAULT.equals(ticketType);
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
		result.append(" (AccessesService: ");
		result.append(accessesService);
		result.append(", RemoteID: ");
		result.append(remoteID);
		result.append(", TicketType: ");
		result.append(ticketType);
		result.append(')');
		return result.toString();
	}

} //CIM_KerberosCredentialImpl
