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

import org.dmtf.cim.CIM_ListenerDestination;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Listener Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ListenerDestinationImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ListenerDestinationImpl extends CIM_ManagedElementImpl implements CIM_ListenerDestination {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected Integer persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected String otherPersistenceType = OTHER_PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocol = OTHER_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ListenerDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ListenerDestination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistenceType(Integer newPersistenceType) {
		Integer oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPersistenceType() {
		return otherPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPersistenceType(String newOtherPersistenceType) {
		String oldOtherPersistenceType = otherPersistenceType;
		otherPersistenceType = newOtherPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__OTHER_PERSISTENCE_TYPE, oldOtherPersistenceType, otherPersistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherProtocol() {
		return otherProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherProtocol(String newOtherProtocol) {
		String oldOtherProtocol = otherProtocol;
		otherProtocol = newOtherProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__OTHER_PROTOCOL, oldOtherProtocol, otherProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(Integer newProtocol) {
		Integer oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LISTENER_DESTINATION__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_LISTENER_DESTINATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_LISTENER_DESTINATION__NAME:
				return getName();
			case CimPackage.CIM_LISTENER_DESTINATION__PERSISTENCE_TYPE:
				return getPersistenceType();
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PERSISTENCE_TYPE:
				return getOtherPersistenceType();
			case CimPackage.CIM_LISTENER_DESTINATION__DESTINATION:
				return getDestination();
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PROTOCOL:
				return getOtherProtocol();
			case CimPackage.CIM_LISTENER_DESTINATION__PROTOCOL:
				return getProtocol();
			case CimPackage.CIM_LISTENER_DESTINATION__PASSWORD:
				return getPassword();
			case CimPackage.CIM_LISTENER_DESTINATION__USERNAME:
				return getUsername();
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
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PERSISTENCE_TYPE:
				setPersistenceType((Integer)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__DESTINATION:
				setDestination((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PROTOCOL:
				setOtherProtocol((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PROTOCOL:
				setProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PASSWORD:
				setPassword((String)newValue);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__USERNAME:
				setUsername((String)newValue);
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
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType(OTHER_PERSISTENCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PROTOCOL:
				setOtherProtocol(OTHER_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CimPackage.CIM_LISTENER_DESTINATION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
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
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_LISTENER_DESTINATION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_LISTENER_DESTINATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_LISTENER_DESTINATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_LISTENER_DESTINATION__PERSISTENCE_TYPE:
				return PERSISTENCE_TYPE_EDEFAULT == null ? persistenceType != null : !PERSISTENCE_TYPE_EDEFAULT.equals(persistenceType);
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PERSISTENCE_TYPE:
				return OTHER_PERSISTENCE_TYPE_EDEFAULT == null ? otherPersistenceType != null : !OTHER_PERSISTENCE_TYPE_EDEFAULT.equals(otherPersistenceType);
			case CimPackage.CIM_LISTENER_DESTINATION__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case CimPackage.CIM_LISTENER_DESTINATION__OTHER_PROTOCOL:
				return OTHER_PROTOCOL_EDEFAULT == null ? otherProtocol != null : !OTHER_PROTOCOL_EDEFAULT.equals(otherProtocol);
			case CimPackage.CIM_LISTENER_DESTINATION__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case CimPackage.CIM_LISTENER_DESTINATION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CimPackage.CIM_LISTENER_DESTINATION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", PersistenceType: ");
		result.append(persistenceType);
		result.append(", OtherPersistenceType: ");
		result.append(otherPersistenceType);
		result.append(", Destination: ");
		result.append(destination);
		result.append(", OtherProtocol: ");
		result.append(otherProtocol);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", password: ");
		result.append(password);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //CIM_ListenerDestinationImpl
