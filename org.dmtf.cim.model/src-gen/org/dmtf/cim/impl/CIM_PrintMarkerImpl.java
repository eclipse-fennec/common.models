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

import org.dmtf.cim.CIM_PrintMarker;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getMarkTech <em>Mark Tech</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getOtherMarkTechDescription <em>Other Mark Tech Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getCounterUnit <em>Counter Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getOtherCounterUnit <em>Other Counter Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getLifeCount <em>Life Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getPowerOnCount <em>Power On Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getProcessColorants <em>Process Colorants</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getSpotColorants <em>Spot Colorants</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getAddressabilityBasis <em>Addressability Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getFeedAddressability <em>Feed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintMarkerImpl#getXFeedAddressability <em>XFeed Addressability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintMarkerImpl extends CIM_PrinterElementImpl implements CIM_PrintMarker {
	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkTech() <em>Mark Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkTech()
	 * @generated
	 * @ordered
	 */
	protected static final Long MARK_TECH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkTech() <em>Mark Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkTech()
	 * @generated
	 * @ordered
	 */
	protected Long markTech = MARK_TECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMarkTechDescription() <em>Other Mark Tech Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMarkTechDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MARK_TECH_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMarkTechDescription() <em>Other Mark Tech Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMarkTechDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherMarkTechDescription = OTHER_MARK_TECH_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterUnit() <em>Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Long COUNTER_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterUnit() <em>Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterUnit()
	 * @generated
	 * @ordered
	 */
	protected Long counterUnit = COUNTER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCounterUnit() <em>Other Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCounterUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COUNTER_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCounterUnit() <em>Other Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCounterUnit()
	 * @generated
	 * @ordered
	 */
	protected String otherCounterUnit = OTHER_COUNTER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifeCount() <em>Life Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIFE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifeCount() <em>Life Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCount()
	 * @generated
	 * @ordered
	 */
	protected Long lifeCount = LIFE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerOnCount() <em>Power On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long POWER_ON_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerOnCount() <em>Power On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnCount()
	 * @generated
	 * @ordered
	 */
	protected Long powerOnCount = POWER_ON_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessColorants() <em>Process Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessColorants()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESS_COLORANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessColorants() <em>Process Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessColorants()
	 * @generated
	 * @ordered
	 */
	protected Long processColorants = PROCESS_COLORANTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpotColorants() <em>Spot Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotColorants()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPOT_COLORANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpotColorants() <em>Spot Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotColorants()
	 * @generated
	 * @ordered
	 */
	protected Long spotColorants = SPOT_COLORANTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintMarker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMarkTech() {
		return markTech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkTech(Long newMarkTech) {
		Long oldMarkTech = markTech;
		markTech = newMarkTech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__MARK_TECH, oldMarkTech, markTech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMarkTechDescription() {
		return otherMarkTechDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMarkTechDescription(String newOtherMarkTechDescription) {
		String oldOtherMarkTechDescription = otherMarkTechDescription;
		otherMarkTechDescription = newOtherMarkTechDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__OTHER_MARK_TECH_DESCRIPTION, oldOtherMarkTechDescription, otherMarkTechDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCounterUnit() {
		return counterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounterUnit(Long newCounterUnit) {
		Long oldCounterUnit = counterUnit;
		counterUnit = newCounterUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__COUNTER_UNIT, oldCounterUnit, counterUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCounterUnit() {
		return otherCounterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCounterUnit(String newOtherCounterUnit) {
		String oldOtherCounterUnit = otherCounterUnit;
		otherCounterUnit = newOtherCounterUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__OTHER_COUNTER_UNIT, oldOtherCounterUnit, otherCounterUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLifeCount() {
		return lifeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifeCount(Long newLifeCount) {
		Long oldLifeCount = lifeCount;
		lifeCount = newLifeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__LIFE_COUNT, oldLifeCount, lifeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPowerOnCount() {
		return powerOnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerOnCount(Long newPowerOnCount) {
		Long oldPowerOnCount = powerOnCount;
		powerOnCount = newPowerOnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__POWER_ON_COUNT, oldPowerOnCount, powerOnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessColorants() {
		return processColorants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessColorants(Long newProcessColorants) {
		Long oldProcessColorants = processColorants;
		processColorants = newProcessColorants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__PROCESS_COLORANTS, oldProcessColorants, processColorants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpotColorants() {
		return spotColorants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpotColorants(Long newSpotColorants) {
		Long oldSpotColorants = spotColorants;
		spotColorants = newSpotColorants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__SPOT_COLORANTS, oldSpotColorants, spotColorants));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__AVAILABILITY_STATUS, oldAvailabilityStatus, availabilityStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__OTHER_AVAILABILITY_STATUS, oldOtherAvailabilityStatus, otherAvailabilityStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__NON_CRITICAL_ALERTS_PRESENT, oldNonCriticalAlertsPresent, nonCriticalAlertsPresent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__CRITICAL_ALERTS_PRESENT, oldCriticalAlertsPresent, criticalAlertsPresent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__ADDRESSABILITY_BASIS, oldAddressabilityBasis, addressabilityBasis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__FEED_ADDRESSABILITY, oldFeedAddressability, feedAddressability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_MARKER__XFEED_ADDRESSABILITY, oldXFeedAddressability, xFeedAddressability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_MARKER__IS_DEFAULT:
				return getIsDefault();
			case CimPackage.CIM_PRINT_MARKER__MARK_TECH:
				return getMarkTech();
			case CimPackage.CIM_PRINT_MARKER__OTHER_MARK_TECH_DESCRIPTION:
				return getOtherMarkTechDescription();
			case CimPackage.CIM_PRINT_MARKER__COUNTER_UNIT:
				return getCounterUnit();
			case CimPackage.CIM_PRINT_MARKER__OTHER_COUNTER_UNIT:
				return getOtherCounterUnit();
			case CimPackage.CIM_PRINT_MARKER__LIFE_COUNT:
				return getLifeCount();
			case CimPackage.CIM_PRINT_MARKER__POWER_ON_COUNT:
				return getPowerOnCount();
			case CimPackage.CIM_PRINT_MARKER__PROCESS_COLORANTS:
				return getProcessColorants();
			case CimPackage.CIM_PRINT_MARKER__SPOT_COLORANTS:
				return getSpotColorants();
			case CimPackage.CIM_PRINT_MARKER__AVAILABILITY_STATUS:
				return getAvailabilityStatus();
			case CimPackage.CIM_PRINT_MARKER__OTHER_AVAILABILITY_STATUS:
				return getOtherAvailabilityStatus();
			case CimPackage.CIM_PRINT_MARKER__NON_CRITICAL_ALERTS_PRESENT:
				return getNonCriticalAlertsPresent();
			case CimPackage.CIM_PRINT_MARKER__CRITICAL_ALERTS_PRESENT:
				return getCriticalAlertsPresent();
			case CimPackage.CIM_PRINT_MARKER__ADDRESSABILITY_BASIS:
				return getAddressabilityBasis();
			case CimPackage.CIM_PRINT_MARKER__FEED_ADDRESSABILITY:
				return getFeedAddressability();
			case CimPackage.CIM_PRINT_MARKER__XFEED_ADDRESSABILITY:
				return getXFeedAddressability();
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
			case CimPackage.CIM_PRINT_MARKER__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__MARK_TECH:
				setMarkTech((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_MARK_TECH_DESCRIPTION:
				setOtherMarkTechDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__COUNTER_UNIT:
				setCounterUnit((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_COUNTER_UNIT:
				setOtherCounterUnit((String)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__LIFE_COUNT:
				setLifeCount((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__POWER_ON_COUNT:
				setPowerOnCount((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__PROCESS_COLORANTS:
				setProcessColorants((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__SPOT_COLORANTS:
				setSpotColorants((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__AVAILABILITY_STATUS:
				setAvailabilityStatus((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus((String)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__ADDRESSABILITY_BASIS:
				setAddressabilityBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__FEED_ADDRESSABILITY:
				setFeedAddressability((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_MARKER__XFEED_ADDRESSABILITY:
				setXFeedAddressability((Long)newValue);
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
			case CimPackage.CIM_PRINT_MARKER__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__MARK_TECH:
				setMarkTech(MARK_TECH_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_MARK_TECH_DESCRIPTION:
				setOtherMarkTechDescription(OTHER_MARK_TECH_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__COUNTER_UNIT:
				setCounterUnit(COUNTER_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_COUNTER_UNIT:
				setOtherCounterUnit(OTHER_COUNTER_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__LIFE_COUNT:
				setLifeCount(LIFE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__POWER_ON_COUNT:
				setPowerOnCount(POWER_ON_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__PROCESS_COLORANTS:
				setProcessColorants(PROCESS_COLORANTS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__SPOT_COLORANTS:
				setSpotColorants(SPOT_COLORANTS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__AVAILABILITY_STATUS:
				setAvailabilityStatus(AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus(OTHER_AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent(NON_CRITICAL_ALERTS_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent(CRITICAL_ALERTS_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__ADDRESSABILITY_BASIS:
				setAddressabilityBasis(ADDRESSABILITY_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__FEED_ADDRESSABILITY:
				setFeedAddressability(FEED_ADDRESSABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_MARKER__XFEED_ADDRESSABILITY:
				setXFeedAddressability(XFEED_ADDRESSABILITY_EDEFAULT);
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
			case CimPackage.CIM_PRINT_MARKER__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case CimPackage.CIM_PRINT_MARKER__MARK_TECH:
				return MARK_TECH_EDEFAULT == null ? markTech != null : !MARK_TECH_EDEFAULT.equals(markTech);
			case CimPackage.CIM_PRINT_MARKER__OTHER_MARK_TECH_DESCRIPTION:
				return OTHER_MARK_TECH_DESCRIPTION_EDEFAULT == null ? otherMarkTechDescription != null : !OTHER_MARK_TECH_DESCRIPTION_EDEFAULT.equals(otherMarkTechDescription);
			case CimPackage.CIM_PRINT_MARKER__COUNTER_UNIT:
				return COUNTER_UNIT_EDEFAULT == null ? counterUnit != null : !COUNTER_UNIT_EDEFAULT.equals(counterUnit);
			case CimPackage.CIM_PRINT_MARKER__OTHER_COUNTER_UNIT:
				return OTHER_COUNTER_UNIT_EDEFAULT == null ? otherCounterUnit != null : !OTHER_COUNTER_UNIT_EDEFAULT.equals(otherCounterUnit);
			case CimPackage.CIM_PRINT_MARKER__LIFE_COUNT:
				return LIFE_COUNT_EDEFAULT == null ? lifeCount != null : !LIFE_COUNT_EDEFAULT.equals(lifeCount);
			case CimPackage.CIM_PRINT_MARKER__POWER_ON_COUNT:
				return POWER_ON_COUNT_EDEFAULT == null ? powerOnCount != null : !POWER_ON_COUNT_EDEFAULT.equals(powerOnCount);
			case CimPackage.CIM_PRINT_MARKER__PROCESS_COLORANTS:
				return PROCESS_COLORANTS_EDEFAULT == null ? processColorants != null : !PROCESS_COLORANTS_EDEFAULT.equals(processColorants);
			case CimPackage.CIM_PRINT_MARKER__SPOT_COLORANTS:
				return SPOT_COLORANTS_EDEFAULT == null ? spotColorants != null : !SPOT_COLORANTS_EDEFAULT.equals(spotColorants);
			case CimPackage.CIM_PRINT_MARKER__AVAILABILITY_STATUS:
				return AVAILABILITY_STATUS_EDEFAULT == null ? availabilityStatus != null : !AVAILABILITY_STATUS_EDEFAULT.equals(availabilityStatus);
			case CimPackage.CIM_PRINT_MARKER__OTHER_AVAILABILITY_STATUS:
				return OTHER_AVAILABILITY_STATUS_EDEFAULT == null ? otherAvailabilityStatus != null : !OTHER_AVAILABILITY_STATUS_EDEFAULT.equals(otherAvailabilityStatus);
			case CimPackage.CIM_PRINT_MARKER__NON_CRITICAL_ALERTS_PRESENT:
				return NON_CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? nonCriticalAlertsPresent != null : !NON_CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(nonCriticalAlertsPresent);
			case CimPackage.CIM_PRINT_MARKER__CRITICAL_ALERTS_PRESENT:
				return CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? criticalAlertsPresent != null : !CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(criticalAlertsPresent);
			case CimPackage.CIM_PRINT_MARKER__ADDRESSABILITY_BASIS:
				return ADDRESSABILITY_BASIS_EDEFAULT == null ? addressabilityBasis != null : !ADDRESSABILITY_BASIS_EDEFAULT.equals(addressabilityBasis);
			case CimPackage.CIM_PRINT_MARKER__FEED_ADDRESSABILITY:
				return FEED_ADDRESSABILITY_EDEFAULT == null ? feedAddressability != null : !FEED_ADDRESSABILITY_EDEFAULT.equals(feedAddressability);
			case CimPackage.CIM_PRINT_MARKER__XFEED_ADDRESSABILITY:
				return XFEED_ADDRESSABILITY_EDEFAULT == null ? xFeedAddressability != null : !XFEED_ADDRESSABILITY_EDEFAULT.equals(xFeedAddressability);
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
		result.append(" (IsDefault: ");
		result.append(isDefault);
		result.append(", MarkTech: ");
		result.append(markTech);
		result.append(", OtherMarkTechDescription: ");
		result.append(otherMarkTechDescription);
		result.append(", CounterUnit: ");
		result.append(counterUnit);
		result.append(", OtherCounterUnit: ");
		result.append(otherCounterUnit);
		result.append(", LifeCount: ");
		result.append(lifeCount);
		result.append(", PowerOnCount: ");
		result.append(powerOnCount);
		result.append(", ProcessColorants: ");
		result.append(processColorants);
		result.append(", SpotColorants: ");
		result.append(spotColorants);
		result.append(", AvailabilityStatus: ");
		result.append(availabilityStatus);
		result.append(", OtherAvailabilityStatus: ");
		result.append(otherAvailabilityStatus);
		result.append(", NonCriticalAlertsPresent: ");
		result.append(nonCriticalAlertsPresent);
		result.append(", CriticalAlertsPresent: ");
		result.append(criticalAlertsPresent);
		result.append(", AddressabilityBasis: ");
		result.append(addressabilityBasis);
		result.append(", FeedAddressability: ");
		result.append(feedAddressability);
		result.append(", XFeedAddressability: ");
		result.append(xFeedAddressability);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintMarkerImpl
