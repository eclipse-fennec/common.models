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

import org.dmtf.cim.CIM_PrintInterpreter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Interpreter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getLangType <em>Lang Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getOtherLangTypeDescription <em>Other Lang Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getLangLevel <em>Lang Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getAddressabilityBasis <em>Addressability Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getFeedAddressability <em>Feed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getXFeedAddressability <em>XFeed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getDefaultCharSetIn <em>Default Char Set In</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInterpreterImpl#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintInterpreterImpl extends CIM_PrinterElementImpl implements CIM_PrintInterpreter {
	/**
	 * The default value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZED_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected String localizedDescription = LOCALIZED_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangType() <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangType()
	 * @generated
	 * @ordered
	 */
	protected static final Long LANG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangType() <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangType()
	 * @generated
	 * @ordered
	 */
	protected Long langType = LANG_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLangTypeDescription() <em>Other Lang Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLangTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LANG_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLangTypeDescription() <em>Other Lang Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLangTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherLangTypeDescription = OTHER_LANG_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangLevel() <em>Lang Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangLevel() <em>Lang Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangLevel()
	 * @generated
	 * @ordered
	 */
	protected String langLevel = LANG_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressabilityBasis() <em>Addressability Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressabilityBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESSABILITY_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressabilityBasis() <em>Addressability Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressabilityBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer addressabilityBasis = ADDRESSABILITY_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedAddressability() <em>Feed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedAddressability()
	 * @generated
	 * @ordered
	 */
	protected static final Long FEED_ADDRESSABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedAddressability() <em>Feed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedAddressability()
	 * @generated
	 * @ordered
	 */
	protected Long feedAddressability = FEED_ADDRESSABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getXFeedAddressability() <em>XFeed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFeedAddressability()
	 * @generated
	 * @ordered
	 */
	protected static final Long XFEED_ADDRESSABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXFeedAddressability() <em>XFeed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFeedAddressability()
	 * @generated
	 * @ordered
	 */
	protected Long xFeedAddressability = XFEED_ADDRESSABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCharSetIn() <em>Default Char Set In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCharSetIn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CHAR_SET_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCharSetIn() <em>Default Char Set In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCharSetIn()
	 * @generated
	 * @ordered
	 */
	protected String defaultCharSetIn = DEFAULT_CHAR_SET_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityStatus() <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABILITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityStatus() <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected Long availabilityStatus = AVAILABILITY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAvailabilityStatus() <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AVAILABILITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAvailabilityStatus() <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected String otherAvailabilityStatus = OTHER_AVAILABILITY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonCriticalAlertsPresent() <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NON_CRITICAL_ALERTS_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonCriticalAlertsPresent() <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected Boolean nonCriticalAlertsPresent = NON_CRITICAL_ALERTS_PRESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalAlertsPresent() <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CRITICAL_ALERTS_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticalAlertsPresent() <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected Boolean criticalAlertsPresent = CRITICAL_ALERTS_PRESENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintInterpreterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintInterpreter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalizedDescription() {
		return localizedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalizedDescription(String newLocalizedDescription) {
		String oldLocalizedDescription = localizedDescription;
		localizedDescription = newLocalizedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__LOCALIZED_DESCRIPTION, oldLocalizedDescription, localizedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLangType() {
		return langType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangType(Long newLangType) {
		Long oldLangType = langType;
		langType = newLangType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__LANG_TYPE, oldLangType, langType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLangTypeDescription() {
		return otherLangTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLangTypeDescription(String newOtherLangTypeDescription) {
		String oldOtherLangTypeDescription = otherLangTypeDescription;
		otherLangTypeDescription = newOtherLangTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__OTHER_LANG_TYPE_DESCRIPTION, oldOtherLangTypeDescription, otherLangTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangLevel() {
		return langLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangLevel(String newLangLevel) {
		String oldLangLevel = langLevel;
		langLevel = newLangLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__LANG_LEVEL, oldLangLevel, langLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressabilityBasis() {
		return addressabilityBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressabilityBasis(Integer newAddressabilityBasis) {
		Integer oldAddressabilityBasis = addressabilityBasis;
		addressabilityBasis = newAddressabilityBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__ADDRESSABILITY_BASIS, oldAddressabilityBasis, addressabilityBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFeedAddressability() {
		return feedAddressability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeedAddressability(Long newFeedAddressability) {
		Long oldFeedAddressability = feedAddressability;
		feedAddressability = newFeedAddressability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__FEED_ADDRESSABILITY, oldFeedAddressability, feedAddressability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getXFeedAddressability() {
		return xFeedAddressability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXFeedAddressability(Long newXFeedAddressability) {
		Long oldXFeedAddressability = xFeedAddressability;
		xFeedAddressability = newXFeedAddressability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__XFEED_ADDRESSABILITY, oldXFeedAddressability, xFeedAddressability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCharSetIn() {
		return defaultCharSetIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCharSetIn(String newDefaultCharSetIn) {
		String oldDefaultCharSetIn = defaultCharSetIn;
		defaultCharSetIn = newDefaultCharSetIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__DEFAULT_CHAR_SET_IN, oldDefaultCharSetIn, defaultCharSetIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailabilityStatus() {
		return availabilityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityStatus(Long newAvailabilityStatus) {
		Long oldAvailabilityStatus = availabilityStatus;
		availabilityStatus = newAvailabilityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__AVAILABILITY_STATUS, oldAvailabilityStatus, availabilityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAvailabilityStatus() {
		return otherAvailabilityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAvailabilityStatus(String newOtherAvailabilityStatus) {
		String oldOtherAvailabilityStatus = otherAvailabilityStatus;
		otherAvailabilityStatus = newOtherAvailabilityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__OTHER_AVAILABILITY_STATUS, oldOtherAvailabilityStatus, otherAvailabilityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNonCriticalAlertsPresent() {
		return nonCriticalAlertsPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonCriticalAlertsPresent(Boolean newNonCriticalAlertsPresent) {
		Boolean oldNonCriticalAlertsPresent = nonCriticalAlertsPresent;
		nonCriticalAlertsPresent = newNonCriticalAlertsPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__NON_CRITICAL_ALERTS_PRESENT, oldNonCriticalAlertsPresent, nonCriticalAlertsPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCriticalAlertsPresent() {
		return criticalAlertsPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticalAlertsPresent(Boolean newCriticalAlertsPresent) {
		Boolean oldCriticalAlertsPresent = criticalAlertsPresent;
		criticalAlertsPresent = newCriticalAlertsPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INTERPRETER__CRITICAL_ALERTS_PRESENT, oldCriticalAlertsPresent, criticalAlertsPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_INTERPRETER__LOCALIZED_DESCRIPTION:
				return getLocalizedDescription();
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_TYPE:
				return getLangType();
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_LANG_TYPE_DESCRIPTION:
				return getOtherLangTypeDescription();
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_LEVEL:
				return getLangLevel();
			case CimPackage.CIM_PRINT_INTERPRETER__ADDRESSABILITY_BASIS:
				return getAddressabilityBasis();
			case CimPackage.CIM_PRINT_INTERPRETER__FEED_ADDRESSABILITY:
				return getFeedAddressability();
			case CimPackage.CIM_PRINT_INTERPRETER__XFEED_ADDRESSABILITY:
				return getXFeedAddressability();
			case CimPackage.CIM_PRINT_INTERPRETER__DEFAULT_CHAR_SET_IN:
				return getDefaultCharSetIn();
			case CimPackage.CIM_PRINT_INTERPRETER__AVAILABILITY_STATUS:
				return getAvailabilityStatus();
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_AVAILABILITY_STATUS:
				return getOtherAvailabilityStatus();
			case CimPackage.CIM_PRINT_INTERPRETER__NON_CRITICAL_ALERTS_PRESENT:
				return getNonCriticalAlertsPresent();
			case CimPackage.CIM_PRINT_INTERPRETER__CRITICAL_ALERTS_PRESENT:
				return getCriticalAlertsPresent();
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
			case CimPackage.CIM_PRINT_INTERPRETER__LOCALIZED_DESCRIPTION:
				setLocalizedDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_TYPE:
				setLangType((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_LANG_TYPE_DESCRIPTION:
				setOtherLangTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_LEVEL:
				setLangLevel((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__ADDRESSABILITY_BASIS:
				setAddressabilityBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__FEED_ADDRESSABILITY:
				setFeedAddressability((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__XFEED_ADDRESSABILITY:
				setXFeedAddressability((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__DEFAULT_CHAR_SET_IN:
				setDefaultCharSetIn((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__AVAILABILITY_STATUS:
				setAvailabilityStatus((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent((Boolean)newValue);
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
			case CimPackage.CIM_PRINT_INTERPRETER__LOCALIZED_DESCRIPTION:
				setLocalizedDescription(LOCALIZED_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_TYPE:
				setLangType(LANG_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_LANG_TYPE_DESCRIPTION:
				setOtherLangTypeDescription(OTHER_LANG_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_LEVEL:
				setLangLevel(LANG_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__ADDRESSABILITY_BASIS:
				setAddressabilityBasis(ADDRESSABILITY_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__FEED_ADDRESSABILITY:
				setFeedAddressability(FEED_ADDRESSABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__XFEED_ADDRESSABILITY:
				setXFeedAddressability(XFEED_ADDRESSABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__DEFAULT_CHAR_SET_IN:
				setDefaultCharSetIn(DEFAULT_CHAR_SET_IN_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__AVAILABILITY_STATUS:
				setAvailabilityStatus(AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus(OTHER_AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent(NON_CRITICAL_ALERTS_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INTERPRETER__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent(CRITICAL_ALERTS_PRESENT_EDEFAULT);
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
			case CimPackage.CIM_PRINT_INTERPRETER__LOCALIZED_DESCRIPTION:
				return LOCALIZED_DESCRIPTION_EDEFAULT == null ? localizedDescription != null : !LOCALIZED_DESCRIPTION_EDEFAULT.equals(localizedDescription);
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_TYPE:
				return LANG_TYPE_EDEFAULT == null ? langType != null : !LANG_TYPE_EDEFAULT.equals(langType);
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_LANG_TYPE_DESCRIPTION:
				return OTHER_LANG_TYPE_DESCRIPTION_EDEFAULT == null ? otherLangTypeDescription != null : !OTHER_LANG_TYPE_DESCRIPTION_EDEFAULT.equals(otherLangTypeDescription);
			case CimPackage.CIM_PRINT_INTERPRETER__LANG_LEVEL:
				return LANG_LEVEL_EDEFAULT == null ? langLevel != null : !LANG_LEVEL_EDEFAULT.equals(langLevel);
			case CimPackage.CIM_PRINT_INTERPRETER__ADDRESSABILITY_BASIS:
				return ADDRESSABILITY_BASIS_EDEFAULT == null ? addressabilityBasis != null : !ADDRESSABILITY_BASIS_EDEFAULT.equals(addressabilityBasis);
			case CimPackage.CIM_PRINT_INTERPRETER__FEED_ADDRESSABILITY:
				return FEED_ADDRESSABILITY_EDEFAULT == null ? feedAddressability != null : !FEED_ADDRESSABILITY_EDEFAULT.equals(feedAddressability);
			case CimPackage.CIM_PRINT_INTERPRETER__XFEED_ADDRESSABILITY:
				return XFEED_ADDRESSABILITY_EDEFAULT == null ? xFeedAddressability != null : !XFEED_ADDRESSABILITY_EDEFAULT.equals(xFeedAddressability);
			case CimPackage.CIM_PRINT_INTERPRETER__DEFAULT_CHAR_SET_IN:
				return DEFAULT_CHAR_SET_IN_EDEFAULT == null ? defaultCharSetIn != null : !DEFAULT_CHAR_SET_IN_EDEFAULT.equals(defaultCharSetIn);
			case CimPackage.CIM_PRINT_INTERPRETER__AVAILABILITY_STATUS:
				return AVAILABILITY_STATUS_EDEFAULT == null ? availabilityStatus != null : !AVAILABILITY_STATUS_EDEFAULT.equals(availabilityStatus);
			case CimPackage.CIM_PRINT_INTERPRETER__OTHER_AVAILABILITY_STATUS:
				return OTHER_AVAILABILITY_STATUS_EDEFAULT == null ? otherAvailabilityStatus != null : !OTHER_AVAILABILITY_STATUS_EDEFAULT.equals(otherAvailabilityStatus);
			case CimPackage.CIM_PRINT_INTERPRETER__NON_CRITICAL_ALERTS_PRESENT:
				return NON_CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? nonCriticalAlertsPresent != null : !NON_CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(nonCriticalAlertsPresent);
			case CimPackage.CIM_PRINT_INTERPRETER__CRITICAL_ALERTS_PRESENT:
				return CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? criticalAlertsPresent != null : !CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(criticalAlertsPresent);
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
		result.append(" (LocalizedDescription: ");
		result.append(localizedDescription);
		result.append(", LangType: ");
		result.append(langType);
		result.append(", OtherLangTypeDescription: ");
		result.append(otherLangTypeDescription);
		result.append(", LangLevel: ");
		result.append(langLevel);
		result.append(", AddressabilityBasis: ");
		result.append(addressabilityBasis);
		result.append(", FeedAddressability: ");
		result.append(feedAddressability);
		result.append(", XFeedAddressability: ");
		result.append(xFeedAddressability);
		result.append(", DefaultCharSetIn: ");
		result.append(defaultCharSetIn);
		result.append(", AvailabilityStatus: ");
		result.append(availabilityStatus);
		result.append(", OtherAvailabilityStatus: ");
		result.append(otherAvailabilityStatus);
		result.append(", NonCriticalAlertsPresent: ");
		result.append(nonCriticalAlertsPresent);
		result.append(", CriticalAlertsPresent: ");
		result.append(criticalAlertsPresent);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintInterpreterImpl
