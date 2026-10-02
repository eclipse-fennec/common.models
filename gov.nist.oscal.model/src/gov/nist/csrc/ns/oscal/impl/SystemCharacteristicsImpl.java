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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AuthorizationBoundary;
import gov.nist.csrc.ns.oscal.DataFlow;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.NetworkArchitecture;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleParty;
import gov.nist.csrc.ns.oscal.SecurityImpactLevel;
import gov.nist.csrc.ns.oscal.SystemCharacteristics;
import gov.nist.csrc.ns.oscal.SystemId;
import gov.nist.csrc.ns.oscal.SystemInformation;
import gov.nist.csrc.ns.oscal.SystemStatus;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSystemNameShort <em>System Name Short</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getDateAuthorized <em>Date Authorized</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSecuritySensitivityLevel <em>Security Sensitivity Level</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSystemInformation <em>System Information</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getSecurityImpactLevel <em>Security Impact Level</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getAuthorizationBoundary <em>Authorization Boundary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getNetworkArchitecture <em>Network Architecture</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemCharacteristicsImpl extends MinimalEObjectImpl.Container implements SystemCharacteristics {
	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemId> systemId;

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
	 * The default value of the '{@link #getSystemNameShort() <em>System Name Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemNameShort()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemNameShort() <em>System Name Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemNameShort()
	 * @generated
	 * @ordered
	 */
	protected String systemNameShort = SYSTEM_NAME_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getDateAuthorized() <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_AUTHORIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAuthorized() <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAuthorized()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAuthorized = DATE_AUTHORIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecuritySensitivityLevel() <em>Security Sensitivity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySensitivityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_SENSITIVITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecuritySensitivityLevel() <em>Security Sensitivity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySensitivityLevel()
	 * @generated
	 * @ordered
	 */
	protected String securitySensitivityLevel = SECURITY_SENSITIVITY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemInformation() <em>System Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemInformation()
	 * @generated
	 * @ordered
	 */
	protected SystemInformation systemInformation;

	/**
	 * The cached value of the '{@link #getSecurityImpactLevel() <em>Security Impact Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityImpactLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityImpactLevel securityImpactLevel;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SystemStatus status;

	/**
	 * The cached value of the '{@link #getAuthorizationBoundary() <em>Authorization Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationBoundary()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationBoundary authorizationBoundary;

	/**
	 * The cached value of the '{@link #getNetworkArchitecture() <em>Network Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkArchitecture()
	 * @generated
	 * @ordered
	 */
	protected NetworkArchitecture networkArchitecture;

	/**
	 * The cached value of the '{@link #getDataFlow() <em>Data Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlow()
	 * @generated
	 * @ordered
	 */
	protected DataFlow dataFlow;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSystemCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemId> getSystemId() {
		if (systemId == null) {
			systemId = new EObjectContainmentEList<SystemId>(SystemId.class, this, OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID);
		}
		return systemId;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemNameShort() {
		return systemNameShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemNameShort(String newSystemNameShort) {
		String oldSystemNameShort = systemNameShort;
		systemNameShort = newSystemNameShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT, oldSystemNameShort, systemNameShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.SYSTEM_CHARACTERISTICS__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.SYSTEM_CHARACTERISTICS__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateAuthorized() {
		return dateAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAuthorized(XMLGregorianCalendar newDateAuthorized) {
		XMLGregorianCalendar oldDateAuthorized = dateAuthorized;
		dateAuthorized = newDateAuthorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED, oldDateAuthorized, dateAuthorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecuritySensitivityLevel() {
		return securitySensitivityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecuritySensitivityLevel(String newSecuritySensitivityLevel) {
		String oldSecuritySensitivityLevel = securitySensitivityLevel;
		securitySensitivityLevel = newSecuritySensitivityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL, oldSecuritySensitivityLevel, securitySensitivityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInformation getSystemInformation() {
		return systemInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemInformation(SystemInformation newSystemInformation, NotificationChain msgs) {
		SystemInformation oldSystemInformation = systemInformation;
		systemInformation = newSystemInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION, oldSystemInformation, newSystemInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemInformation(SystemInformation newSystemInformation) {
		if (newSystemInformation != systemInformation) {
			NotificationChain msgs = null;
			if (systemInformation != null)
				msgs = ((InternalEObject)systemInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION, null, msgs);
			if (newSystemInformation != null)
				msgs = ((InternalEObject)newSystemInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION, null, msgs);
			msgs = basicSetSystemInformation(newSystemInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION, newSystemInformation, newSystemInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityImpactLevel getSecurityImpactLevel() {
		return securityImpactLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityImpactLevel(SecurityImpactLevel newSecurityImpactLevel, NotificationChain msgs) {
		SecurityImpactLevel oldSecurityImpactLevel = securityImpactLevel;
		securityImpactLevel = newSecurityImpactLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL, oldSecurityImpactLevel, newSecurityImpactLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityImpactLevel(SecurityImpactLevel newSecurityImpactLevel) {
		if (newSecurityImpactLevel != securityImpactLevel) {
			NotificationChain msgs = null;
			if (securityImpactLevel != null)
				msgs = ((InternalEObject)securityImpactLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL, null, msgs);
			if (newSecurityImpactLevel != null)
				msgs = ((InternalEObject)newSecurityImpactLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL, null, msgs);
			msgs = basicSetSecurityImpactLevel(newSecurityImpactLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL, newSecurityImpactLevel, newSecurityImpactLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SystemStatus newStatus, NotificationChain msgs) {
		SystemStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SystemStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationBoundary getAuthorizationBoundary() {
		return authorizationBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationBoundary(AuthorizationBoundary newAuthorizationBoundary, NotificationChain msgs) {
		AuthorizationBoundary oldAuthorizationBoundary = authorizationBoundary;
		authorizationBoundary = newAuthorizationBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY, oldAuthorizationBoundary, newAuthorizationBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationBoundary(AuthorizationBoundary newAuthorizationBoundary) {
		if (newAuthorizationBoundary != authorizationBoundary) {
			NotificationChain msgs = null;
			if (authorizationBoundary != null)
				msgs = ((InternalEObject)authorizationBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY, null, msgs);
			if (newAuthorizationBoundary != null)
				msgs = ((InternalEObject)newAuthorizationBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY, null, msgs);
			msgs = basicSetAuthorizationBoundary(newAuthorizationBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY, newAuthorizationBoundary, newAuthorizationBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkArchitecture getNetworkArchitecture() {
		return networkArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkArchitecture(NetworkArchitecture newNetworkArchitecture, NotificationChain msgs) {
		NetworkArchitecture oldNetworkArchitecture = networkArchitecture;
		networkArchitecture = newNetworkArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE, oldNetworkArchitecture, newNetworkArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkArchitecture(NetworkArchitecture newNetworkArchitecture) {
		if (newNetworkArchitecture != networkArchitecture) {
			NotificationChain msgs = null;
			if (networkArchitecture != null)
				msgs = ((InternalEObject)networkArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE, null, msgs);
			if (newNetworkArchitecture != null)
				msgs = ((InternalEObject)newNetworkArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE, null, msgs);
			msgs = basicSetNetworkArchitecture(newNetworkArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE, newNetworkArchitecture, newNetworkArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlow getDataFlow() {
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFlow(DataFlow newDataFlow, NotificationChain msgs) {
		DataFlow oldDataFlow = dataFlow;
		dataFlow = newDataFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW, oldDataFlow, newDataFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFlow(DataFlow newDataFlow) {
		if (newDataFlow != dataFlow) {
			NotificationChain msgs = null;
			if (dataFlow != null)
				msgs = ((InternalEObject)dataFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW, null, msgs);
			if (newDataFlow != null)
				msgs = ((InternalEObject)newDataFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW, null, msgs);
			msgs = basicSetDataFlow(newDataFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW, newDataFlow, newDataFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_CHARACTERISTICS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID:
				return ((InternalEList<?>)getSystemId()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION:
				return basicSetSystemInformation(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL:
				return basicSetSecurityImpactLevel(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS:
				return basicSetStatus(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY:
				return basicSetAuthorizationBoundary(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE:
				return basicSetNetworkArchitecture(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW:
				return basicSetDataFlow(null, msgs);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID:
				return getSystemId();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME:
				return getSystemName();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT:
				return getSystemNameShort();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DESCRIPTION:
				return getDescription();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__PROP:
				return getProp();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__LINK:
				return getLink();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED:
				return getDateAuthorized();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL:
				return getSecuritySensitivityLevel();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION:
				return getSystemInformation();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL:
				return getSecurityImpactLevel();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS:
				return getStatus();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY:
				return getAuthorizationBoundary();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE:
				return getNetworkArchitecture();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW:
				return getDataFlow();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__REMARKS:
				return getRemarks();
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
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID:
				getSystemId().clear();
				getSystemId().addAll((Collection<? extends SystemId>)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT:
				setSystemNameShort((String)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED:
				setDateAuthorized((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL:
				setSecuritySensitivityLevel((String)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION:
				setSystemInformation((SystemInformation)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL:
				setSecurityImpactLevel((SecurityImpactLevel)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS:
				setStatus((SystemStatus)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY:
				setAuthorizationBoundary((AuthorizationBoundary)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE:
				setNetworkArchitecture((NetworkArchitecture)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW:
				setDataFlow((DataFlow)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__REMARKS:
				setRemarks((String)newValue);
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
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID:
				getSystemId().clear();
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT:
				setSystemNameShort(SYSTEM_NAME_SHORT_EDEFAULT);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__PROP:
				getProp().clear();
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__LINK:
				getLink().clear();
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED:
				setDateAuthorized(DATE_AUTHORIZED_EDEFAULT);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL:
				setSecuritySensitivityLevel(SECURITY_SENSITIVITY_LEVEL_EDEFAULT);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION:
				setSystemInformation((SystemInformation)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL:
				setSecurityImpactLevel((SecurityImpactLevel)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS:
				setStatus((SystemStatus)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY:
				setAuthorizationBoundary((AuthorizationBoundary)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE:
				setNetworkArchitecture((NetworkArchitecture)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW:
				setDataFlow((DataFlow)null);
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
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
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_ID:
				return systemId != null && !systemId.isEmpty();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT:
				return SYSTEM_NAME_SHORT_EDEFAULT == null ? systemNameShort != null : !SYSTEM_NAME_SHORT_EDEFAULT.equals(systemNameShort);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED:
				return DATE_AUTHORIZED_EDEFAULT == null ? dateAuthorized != null : !DATE_AUTHORIZED_EDEFAULT.equals(dateAuthorized);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL:
				return SECURITY_SENSITIVITY_LEVEL_EDEFAULT == null ? securitySensitivityLevel != null : !SECURITY_SENSITIVITY_LEVEL_EDEFAULT.equals(securitySensitivityLevel);
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION:
				return systemInformation != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL:
				return securityImpactLevel != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__STATUS:
				return status != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY:
				return authorizationBoundary != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE:
				return networkArchitecture != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__DATA_FLOW:
				return dataFlow != null;
			case OSCALPackage.SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case OSCALPackage.SYSTEM_CHARACTERISTICS__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(", systemNameShort: ");
		result.append(systemNameShort);
		result.append(", description: ");
		result.append(description);
		result.append(", dateAuthorized: ");
		result.append(dateAuthorized);
		result.append(", securitySensitivityLevel: ");
		result.append(securitySensitivityLevel);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //SystemCharacteristicsImpl
