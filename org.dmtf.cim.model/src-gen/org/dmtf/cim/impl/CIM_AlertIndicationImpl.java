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

import org.dmtf.cim.CIM_AlertIndication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Alert Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getAlertingManagedElement <em>Alerting Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getAlertingElementFormat <em>Alerting Element Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getOtherAlertingElementFormat <em>Other Alerting Element Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getAlertType <em>Alert Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getOtherAlertType <em>Other Alert Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getProbableCause <em>Probable Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getProbableCauseDescription <em>Probable Cause Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getTrending <em>Trending</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getRecommendedActions <em>Recommended Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getEventID <em>Event ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getEventTime <em>Event Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlertIndicationImpl#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AlertIndicationImpl extends CIM_ProcessIndicationImpl implements CIM_AlertIndication {
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
	 * The default value of the '{@link #getAlertingManagedElement() <em>Alerting Managed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertingManagedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALERTING_MANAGED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlertingManagedElement() <em>Alerting Managed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertingManagedElement()
	 * @generated
	 * @ordered
	 */
	protected String alertingManagedElement = ALERTING_MANAGED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlertingElementFormat() <em>Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertingElementFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALERTING_ELEMENT_FORMAT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getAlertingElementFormat() <em>Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertingElementFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer alertingElementFormat = ALERTING_ELEMENT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAlertingElementFormat() <em>Other Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlertingElementFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ALERTING_ELEMENT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAlertingElementFormat() <em>Other Alerting Element Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlertingElementFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherAlertingElementFormat = OTHER_ALERTING_ELEMENT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlertType() <em>Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALERT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlertType() <em>Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertType()
	 * @generated
	 * @ordered
	 */
	protected Integer alertType = ALERT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAlertType() <em>Other Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlertType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ALERT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAlertType() <em>Other Alert Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlertType()
	 * @generated
	 * @ordered
	 */
	protected String otherAlertType = OTHER_ALERT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbableCause() <em>Probable Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbableCause()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROBABLE_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbableCause() <em>Probable Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbableCause()
	 * @generated
	 * @ordered
	 */
	protected Integer probableCause = PROBABLE_CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbableCauseDescription() <em>Probable Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbableCauseDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBABLE_CAUSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbableCauseDescription() <em>Probable Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbableCauseDescription()
	 * @generated
	 * @ordered
	 */
	protected String probableCauseDescription = PROBABLE_CAUSE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrending() <em>Trending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrending()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRENDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrending() <em>Trending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrending()
	 * @generated
	 * @ordered
	 */
	protected Integer trending = TRENDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecommendedActions() <em>Recommended Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recommendedActions;

	/**
	 * The default value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected String eventID = EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventTime() <em>Event Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTime()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventTime() <em>Event Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTime()
	 * @generated
	 * @ordered
	 */
	protected String eventTime = EVENT_TIME_EDEFAULT;

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
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageArguments() <em>Message Arguments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messageArguments;

	/**
	 * The default value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected String messageID = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwningEntity() <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningEntity() <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected String owningEntity = OWNING_ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AlertIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AlertIndication();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlertingManagedElement() {
		return alertingManagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlertingManagedElement(String newAlertingManagedElement) {
		String oldAlertingManagedElement = alertingManagedElement;
		alertingManagedElement = newAlertingManagedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__ALERTING_MANAGED_ELEMENT, oldAlertingManagedElement, alertingManagedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlertingElementFormat() {
		return alertingElementFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlertingElementFormat(Integer newAlertingElementFormat) {
		Integer oldAlertingElementFormat = alertingElementFormat;
		alertingElementFormat = newAlertingElementFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__ALERTING_ELEMENT_FORMAT, oldAlertingElementFormat, alertingElementFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAlertingElementFormat() {
		return otherAlertingElementFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAlertingElementFormat(String newOtherAlertingElementFormat) {
		String oldOtherAlertingElementFormat = otherAlertingElementFormat;
		otherAlertingElementFormat = newOtherAlertingElementFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__OTHER_ALERTING_ELEMENT_FORMAT, oldOtherAlertingElementFormat, otherAlertingElementFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlertType() {
		return alertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlertType(Integer newAlertType) {
		Integer oldAlertType = alertType;
		alertType = newAlertType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__ALERT_TYPE, oldAlertType, alertType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAlertType() {
		return otherAlertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAlertType(String newOtherAlertType) {
		String oldOtherAlertType = otherAlertType;
		otherAlertType = newOtherAlertType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__OTHER_ALERT_TYPE, oldOtherAlertType, otherAlertType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProbableCause() {
		return probableCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbableCause(Integer newProbableCause) {
		Integer oldProbableCause = probableCause;
		probableCause = newProbableCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE, oldProbableCause, probableCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProbableCauseDescription() {
		return probableCauseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbableCauseDescription(String newProbableCauseDescription) {
		String oldProbableCauseDescription = probableCauseDescription;
		probableCauseDescription = newProbableCauseDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE_DESCRIPTION, oldProbableCauseDescription, probableCauseDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTrending() {
		return trending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrending(Integer newTrending) {
		Integer oldTrending = trending;
		trending = newTrending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__TRENDING, oldTrending, trending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecommendedActions() {
		if (recommendedActions == null) {
			recommendedActions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ALERT_INDICATION__RECOMMENDED_ACTIONS);
		}
		return recommendedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventID() {
		return eventID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventID(String newEventID) {
		String oldEventID = eventID;
		eventID = newEventID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__EVENT_ID, oldEventID, eventID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventTime() {
		return eventTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventTime(String newEventTime) {
		String oldEventTime = eventTime;
		eventTime = newEventTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__EVENT_TIME, oldEventTime, eventTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMessageArguments() {
		if (messageArguments == null) {
			messageArguments = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ALERT_INDICATION__MESSAGE_ARGUMENTS);
		}
		return messageArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageID() {
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageID(String newMessageID) {
		String oldMessageID = messageID;
		messageID = newMessageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__MESSAGE_ID, oldMessageID, messageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwningEntity() {
		return owningEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningEntity(String newOwningEntity) {
		String oldOwningEntity = owningEntity;
		owningEntity = newOwningEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALERT_INDICATION__OWNING_ENTITY, oldOwningEntity, owningEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALERT_INDICATION__DESCRIPTION:
				return getDescription();
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_MANAGED_ELEMENT:
				return getAlertingManagedElement();
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_ELEMENT_FORMAT:
				return getAlertingElementFormat();
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERTING_ELEMENT_FORMAT:
				return getOtherAlertingElementFormat();
			case CimPackage.CIM_ALERT_INDICATION__ALERT_TYPE:
				return getAlertType();
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERT_TYPE:
				return getOtherAlertType();
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE:
				return getProbableCause();
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE_DESCRIPTION:
				return getProbableCauseDescription();
			case CimPackage.CIM_ALERT_INDICATION__TRENDING:
				return getTrending();
			case CimPackage.CIM_ALERT_INDICATION__RECOMMENDED_ACTIONS:
				return getRecommendedActions();
			case CimPackage.CIM_ALERT_INDICATION__EVENT_ID:
				return getEventID();
			case CimPackage.CIM_ALERT_INDICATION__EVENT_TIME:
				return getEventTime();
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_ALERT_INDICATION__PROVIDER_NAME:
				return getProviderName();
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE:
				return getMessage();
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ARGUMENTS:
				return getMessageArguments();
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ID:
				return getMessageID();
			case CimPackage.CIM_ALERT_INDICATION__OWNING_ENTITY:
				return getOwningEntity();
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
			case CimPackage.CIM_ALERT_INDICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_MANAGED_ELEMENT:
				setAlertingManagedElement((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_ELEMENT_FORMAT:
				setAlertingElementFormat((Integer)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERTING_ELEMENT_FORMAT:
				setOtherAlertingElementFormat((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERT_TYPE:
				setAlertType((Integer)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERT_TYPE:
				setOtherAlertType((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE:
				setProbableCause((Integer)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE_DESCRIPTION:
				setProbableCauseDescription((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__TRENDING:
				setTrending((Integer)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__RECOMMENDED_ACTIONS:
				getRecommendedActions().clear();
				getRecommendedActions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__EVENT_ID:
				setEventID((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__EVENT_TIME:
				setEventTime((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE:
				setMessage((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				getMessageArguments().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ID:
				setMessageID((String)newValue);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OWNING_ENTITY:
				setOwningEntity((String)newValue);
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
			case CimPackage.CIM_ALERT_INDICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_MANAGED_ELEMENT:
				setAlertingManagedElement(ALERTING_MANAGED_ELEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_ELEMENT_FORMAT:
				setAlertingElementFormat(ALERTING_ELEMENT_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERTING_ELEMENT_FORMAT:
				setOtherAlertingElementFormat(OTHER_ALERTING_ELEMENT_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__ALERT_TYPE:
				setAlertType(ALERT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERT_TYPE:
				setOtherAlertType(OTHER_ALERT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE:
				setProbableCause(PROBABLE_CAUSE_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE_DESCRIPTION:
				setProbableCauseDescription(PROBABLE_CAUSE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__TRENDING:
				setTrending(TRENDING_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__RECOMMENDED_ACTIONS:
				getRecommendedActions().clear();
				return;
			case CimPackage.CIM_ALERT_INDICATION__EVENT_ID:
				setEventID(EVENT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__EVENT_TIME:
				setEventTime(EVENT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				return;
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ALERT_INDICATION__OWNING_ENTITY:
				setOwningEntity(OWNING_ENTITY_EDEFAULT);
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
			case CimPackage.CIM_ALERT_INDICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_MANAGED_ELEMENT:
				return ALERTING_MANAGED_ELEMENT_EDEFAULT == null ? alertingManagedElement != null : !ALERTING_MANAGED_ELEMENT_EDEFAULT.equals(alertingManagedElement);
			case CimPackage.CIM_ALERT_INDICATION__ALERTING_ELEMENT_FORMAT:
				return ALERTING_ELEMENT_FORMAT_EDEFAULT == null ? alertingElementFormat != null : !ALERTING_ELEMENT_FORMAT_EDEFAULT.equals(alertingElementFormat);
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERTING_ELEMENT_FORMAT:
				return OTHER_ALERTING_ELEMENT_FORMAT_EDEFAULT == null ? otherAlertingElementFormat != null : !OTHER_ALERTING_ELEMENT_FORMAT_EDEFAULT.equals(otherAlertingElementFormat);
			case CimPackage.CIM_ALERT_INDICATION__ALERT_TYPE:
				return ALERT_TYPE_EDEFAULT == null ? alertType != null : !ALERT_TYPE_EDEFAULT.equals(alertType);
			case CimPackage.CIM_ALERT_INDICATION__OTHER_ALERT_TYPE:
				return OTHER_ALERT_TYPE_EDEFAULT == null ? otherAlertType != null : !OTHER_ALERT_TYPE_EDEFAULT.equals(otherAlertType);
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE:
				return PROBABLE_CAUSE_EDEFAULT == null ? probableCause != null : !PROBABLE_CAUSE_EDEFAULT.equals(probableCause);
			case CimPackage.CIM_ALERT_INDICATION__PROBABLE_CAUSE_DESCRIPTION:
				return PROBABLE_CAUSE_DESCRIPTION_EDEFAULT == null ? probableCauseDescription != null : !PROBABLE_CAUSE_DESCRIPTION_EDEFAULT.equals(probableCauseDescription);
			case CimPackage.CIM_ALERT_INDICATION__TRENDING:
				return TRENDING_EDEFAULT == null ? trending != null : !TRENDING_EDEFAULT.equals(trending);
			case CimPackage.CIM_ALERT_INDICATION__RECOMMENDED_ACTIONS:
				return recommendedActions != null && !recommendedActions.isEmpty();
			case CimPackage.CIM_ALERT_INDICATION__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventID != null : !EVENT_ID_EDEFAULT.equals(eventID);
			case CimPackage.CIM_ALERT_INDICATION__EVENT_TIME:
				return EVENT_TIME_EDEFAULT == null ? eventTime != null : !EVENT_TIME_EDEFAULT.equals(eventTime);
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_ALERT_INDICATION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_ALERT_INDICATION__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ARGUMENTS:
				return messageArguments != null && !messageArguments.isEmpty();
			case CimPackage.CIM_ALERT_INDICATION__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageID != null : !MESSAGE_ID_EDEFAULT.equals(messageID);
			case CimPackage.CIM_ALERT_INDICATION__OWNING_ENTITY:
				return OWNING_ENTITY_EDEFAULT == null ? owningEntity != null : !OWNING_ENTITY_EDEFAULT.equals(owningEntity);
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
		result.append(" (Description: ");
		result.append(description);
		result.append(", AlertingManagedElement: ");
		result.append(alertingManagedElement);
		result.append(", AlertingElementFormat: ");
		result.append(alertingElementFormat);
		result.append(", OtherAlertingElementFormat: ");
		result.append(otherAlertingElementFormat);
		result.append(", AlertType: ");
		result.append(alertType);
		result.append(", OtherAlertType: ");
		result.append(otherAlertType);
		result.append(", ProbableCause: ");
		result.append(probableCause);
		result.append(", ProbableCauseDescription: ");
		result.append(probableCauseDescription);
		result.append(", Trending: ");
		result.append(trending);
		result.append(", RecommendedActions: ");
		result.append(recommendedActions);
		result.append(", EventID: ");
		result.append(eventID);
		result.append(", EventTime: ");
		result.append(eventTime);
		result.append(", SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", ProviderName: ");
		result.append(providerName);
		result.append(", Message: ");
		result.append(message);
		result.append(", MessageArguments: ");
		result.append(messageArguments);
		result.append(", MessageID: ");
		result.append(messageID);
		result.append(", OwningEntity: ");
		result.append(owningEntity);
		result.append(')');
		return result.toString();
	}

} //CIM_AlertIndicationImpl
