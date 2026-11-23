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

import org.dmtf.cim.CIM_Error;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getErrorType <em>Error Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getOtherErrorType <em>Other Error Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getOwningEntity <em>Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getProbableCause <em>Probable Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getProbableCauseDescription <em>Probable Cause Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getRecommendedActions <em>Recommended Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getErrorSource <em>Error Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getErrorSourceFormat <em>Error Source Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getOtherErrorSourceFormat <em>Other Error Source Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getCIMStatusCode <em>CIM Status Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ErrorImpl#getCIMStatusCodeDescription <em>CIM Status Code Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ErrorImpl extends MinimalEObjectImpl.Container implements CIM_Error {
	/**
	 * The default value of the '{@link #getErrorType() <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorType() <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected Integer errorType = ERROR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherErrorType() <em>Other Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ERROR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherErrorType() <em>Other Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorType()
	 * @generated
	 * @ordered
	 */
	protected String otherErrorType = OTHER_ERROR_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCEIVED_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer perceivedSeverity = PERCEIVED_SEVERITY_EDEFAULT;

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
	 * The cached value of the '{@link #getRecommendedActions() <em>Recommended Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recommendedActions;

	/**
	 * The default value of the '{@link #getErrorSource() <em>Error Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSource()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorSource() <em>Error Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSource()
	 * @generated
	 * @ordered
	 */
	protected String errorSource = ERROR_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorSourceFormat() <em>Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSourceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_SOURCE_FORMAT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getErrorSourceFormat() <em>Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSourceFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer errorSourceFormat = ERROR_SOURCE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherErrorSourceFormat() <em>Other Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorSourceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ERROR_SOURCE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherErrorSourceFormat() <em>Other Error Source Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorSourceFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherErrorSourceFormat = OTHER_ERROR_SOURCE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCIMStatusCode() <em>CIM Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static final Long CIM_STATUS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIMStatusCode() <em>CIM Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMStatusCode()
	 * @generated
	 * @ordered
	 */
	protected Long cimStatusCode = CIM_STATUS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCIMStatusCodeDescription() <em>CIM Status Code Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMStatusCodeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CIM_STATUS_CODE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIMStatusCodeDescription() <em>CIM Status Code Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMStatusCodeDescription()
	 * @generated
	 * @ordered
	 */
	protected String cimStatusCodeDescription = CIM_STATUS_CODE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Error();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorType() {
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorType(Integer newErrorType) {
		Integer oldErrorType = errorType;
		errorType = newErrorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__ERROR_TYPE, oldErrorType, errorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherErrorType() {
		return otherErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherErrorType(String newOtherErrorType) {
		String oldOtherErrorType = otherErrorType;
		otherErrorType = newOtherErrorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__OTHER_ERROR_TYPE, oldOtherErrorType, otherErrorType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__OWNING_ENTITY, oldOwningEntity, owningEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__MESSAGE_ID, oldMessageID, messageID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMessageArguments() {
		if (messageArguments == null) {
			messageArguments = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ERROR__MESSAGE_ARGUMENTS);
		}
		return messageArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerceivedSeverity(Integer newPerceivedSeverity) {
		Integer oldPerceivedSeverity = perceivedSeverity;
		perceivedSeverity = newPerceivedSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__PERCEIVED_SEVERITY, oldPerceivedSeverity, perceivedSeverity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__PROBABLE_CAUSE, oldProbableCause, probableCause));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__PROBABLE_CAUSE_DESCRIPTION, oldProbableCauseDescription, probableCauseDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecommendedActions() {
		if (recommendedActions == null) {
			recommendedActions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ERROR__RECOMMENDED_ACTIONS);
		}
		return recommendedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorSource() {
		return errorSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorSource(String newErrorSource) {
		String oldErrorSource = errorSource;
		errorSource = newErrorSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__ERROR_SOURCE, oldErrorSource, errorSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorSourceFormat() {
		return errorSourceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorSourceFormat(Integer newErrorSourceFormat) {
		Integer oldErrorSourceFormat = errorSourceFormat;
		errorSourceFormat = newErrorSourceFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__ERROR_SOURCE_FORMAT, oldErrorSourceFormat, errorSourceFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherErrorSourceFormat() {
		return otherErrorSourceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherErrorSourceFormat(String newOtherErrorSourceFormat) {
		String oldOtherErrorSourceFormat = otherErrorSourceFormat;
		otherErrorSourceFormat = newOtherErrorSourceFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__OTHER_ERROR_SOURCE_FORMAT, oldOtherErrorSourceFormat, otherErrorSourceFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCIMStatusCode() {
		return cimStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIMStatusCode(Long newCIMStatusCode) {
		Long oldCIMStatusCode = cimStatusCode;
		cimStatusCode = newCIMStatusCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__CIM_STATUS_CODE, oldCIMStatusCode, cimStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCIMStatusCodeDescription() {
		return cimStatusCodeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIMStatusCodeDescription(String newCIMStatusCodeDescription) {
		String oldCIMStatusCodeDescription = cimStatusCodeDescription;
		cimStatusCodeDescription = newCIMStatusCodeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ERROR__CIM_STATUS_CODE_DESCRIPTION, oldCIMStatusCodeDescription, cimStatusCodeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ERROR__ERROR_TYPE:
				return getErrorType();
			case CimPackage.CIM_ERROR__OTHER_ERROR_TYPE:
				return getOtherErrorType();
			case CimPackage.CIM_ERROR__OWNING_ENTITY:
				return getOwningEntity();
			case CimPackage.CIM_ERROR__MESSAGE_ID:
				return getMessageID();
			case CimPackage.CIM_ERROR__MESSAGE:
				return getMessage();
			case CimPackage.CIM_ERROR__MESSAGE_ARGUMENTS:
				return getMessageArguments();
			case CimPackage.CIM_ERROR__PERCEIVED_SEVERITY:
				return getPerceivedSeverity();
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE:
				return getProbableCause();
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE_DESCRIPTION:
				return getProbableCauseDescription();
			case CimPackage.CIM_ERROR__RECOMMENDED_ACTIONS:
				return getRecommendedActions();
			case CimPackage.CIM_ERROR__ERROR_SOURCE:
				return getErrorSource();
			case CimPackage.CIM_ERROR__ERROR_SOURCE_FORMAT:
				return getErrorSourceFormat();
			case CimPackage.CIM_ERROR__OTHER_ERROR_SOURCE_FORMAT:
				return getOtherErrorSourceFormat();
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE:
				return getCIMStatusCode();
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE_DESCRIPTION:
				return getCIMStatusCodeDescription();
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
			case CimPackage.CIM_ERROR__ERROR_TYPE:
				setErrorType((Integer)newValue);
				return;
			case CimPackage.CIM_ERROR__OTHER_ERROR_TYPE:
				setOtherErrorType((String)newValue);
				return;
			case CimPackage.CIM_ERROR__OWNING_ENTITY:
				setOwningEntity((String)newValue);
				return;
			case CimPackage.CIM_ERROR__MESSAGE_ID:
				setMessageID((String)newValue);
				return;
			case CimPackage.CIM_ERROR__MESSAGE:
				setMessage((String)newValue);
				return;
			case CimPackage.CIM_ERROR__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				getMessageArguments().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ERROR__PERCEIVED_SEVERITY:
				setPerceivedSeverity((Integer)newValue);
				return;
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE:
				setProbableCause((Integer)newValue);
				return;
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE_DESCRIPTION:
				setProbableCauseDescription((String)newValue);
				return;
			case CimPackage.CIM_ERROR__RECOMMENDED_ACTIONS:
				getRecommendedActions().clear();
				getRecommendedActions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ERROR__ERROR_SOURCE:
				setErrorSource((String)newValue);
				return;
			case CimPackage.CIM_ERROR__ERROR_SOURCE_FORMAT:
				setErrorSourceFormat((Integer)newValue);
				return;
			case CimPackage.CIM_ERROR__OTHER_ERROR_SOURCE_FORMAT:
				setOtherErrorSourceFormat((String)newValue);
				return;
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE:
				setCIMStatusCode((Long)newValue);
				return;
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE_DESCRIPTION:
				setCIMStatusCodeDescription((String)newValue);
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
			case CimPackage.CIM_ERROR__ERROR_TYPE:
				setErrorType(ERROR_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__OTHER_ERROR_TYPE:
				setOtherErrorType(OTHER_ERROR_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__OWNING_ENTITY:
				setOwningEntity(OWNING_ENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				return;
			case CimPackage.CIM_ERROR__PERCEIVED_SEVERITY:
				setPerceivedSeverity(PERCEIVED_SEVERITY_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE:
				setProbableCause(PROBABLE_CAUSE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE_DESCRIPTION:
				setProbableCauseDescription(PROBABLE_CAUSE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__RECOMMENDED_ACTIONS:
				getRecommendedActions().clear();
				return;
			case CimPackage.CIM_ERROR__ERROR_SOURCE:
				setErrorSource(ERROR_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__ERROR_SOURCE_FORMAT:
				setErrorSourceFormat(ERROR_SOURCE_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__OTHER_ERROR_SOURCE_FORMAT:
				setOtherErrorSourceFormat(OTHER_ERROR_SOURCE_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE:
				setCIMStatusCode(CIM_STATUS_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE_DESCRIPTION:
				setCIMStatusCodeDescription(CIM_STATUS_CODE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_ERROR__ERROR_TYPE:
				return ERROR_TYPE_EDEFAULT == null ? errorType != null : !ERROR_TYPE_EDEFAULT.equals(errorType);
			case CimPackage.CIM_ERROR__OTHER_ERROR_TYPE:
				return OTHER_ERROR_TYPE_EDEFAULT == null ? otherErrorType != null : !OTHER_ERROR_TYPE_EDEFAULT.equals(otherErrorType);
			case CimPackage.CIM_ERROR__OWNING_ENTITY:
				return OWNING_ENTITY_EDEFAULT == null ? owningEntity != null : !OWNING_ENTITY_EDEFAULT.equals(owningEntity);
			case CimPackage.CIM_ERROR__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageID != null : !MESSAGE_ID_EDEFAULT.equals(messageID);
			case CimPackage.CIM_ERROR__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CimPackage.CIM_ERROR__MESSAGE_ARGUMENTS:
				return messageArguments != null && !messageArguments.isEmpty();
			case CimPackage.CIM_ERROR__PERCEIVED_SEVERITY:
				return PERCEIVED_SEVERITY_EDEFAULT == null ? perceivedSeverity != null : !PERCEIVED_SEVERITY_EDEFAULT.equals(perceivedSeverity);
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE:
				return PROBABLE_CAUSE_EDEFAULT == null ? probableCause != null : !PROBABLE_CAUSE_EDEFAULT.equals(probableCause);
			case CimPackage.CIM_ERROR__PROBABLE_CAUSE_DESCRIPTION:
				return PROBABLE_CAUSE_DESCRIPTION_EDEFAULT == null ? probableCauseDescription != null : !PROBABLE_CAUSE_DESCRIPTION_EDEFAULT.equals(probableCauseDescription);
			case CimPackage.CIM_ERROR__RECOMMENDED_ACTIONS:
				return recommendedActions != null && !recommendedActions.isEmpty();
			case CimPackage.CIM_ERROR__ERROR_SOURCE:
				return ERROR_SOURCE_EDEFAULT == null ? errorSource != null : !ERROR_SOURCE_EDEFAULT.equals(errorSource);
			case CimPackage.CIM_ERROR__ERROR_SOURCE_FORMAT:
				return ERROR_SOURCE_FORMAT_EDEFAULT == null ? errorSourceFormat != null : !ERROR_SOURCE_FORMAT_EDEFAULT.equals(errorSourceFormat);
			case CimPackage.CIM_ERROR__OTHER_ERROR_SOURCE_FORMAT:
				return OTHER_ERROR_SOURCE_FORMAT_EDEFAULT == null ? otherErrorSourceFormat != null : !OTHER_ERROR_SOURCE_FORMAT_EDEFAULT.equals(otherErrorSourceFormat);
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE:
				return CIM_STATUS_CODE_EDEFAULT == null ? cimStatusCode != null : !CIM_STATUS_CODE_EDEFAULT.equals(cimStatusCode);
			case CimPackage.CIM_ERROR__CIM_STATUS_CODE_DESCRIPTION:
				return CIM_STATUS_CODE_DESCRIPTION_EDEFAULT == null ? cimStatusCodeDescription != null : !CIM_STATUS_CODE_DESCRIPTION_EDEFAULT.equals(cimStatusCodeDescription);
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
		result.append(" (ErrorType: ");
		result.append(errorType);
		result.append(", OtherErrorType: ");
		result.append(otherErrorType);
		result.append(", OwningEntity: ");
		result.append(owningEntity);
		result.append(", MessageID: ");
		result.append(messageID);
		result.append(", Message: ");
		result.append(message);
		result.append(", MessageArguments: ");
		result.append(messageArguments);
		result.append(", PerceivedSeverity: ");
		result.append(perceivedSeverity);
		result.append(", ProbableCause: ");
		result.append(probableCause);
		result.append(", ProbableCauseDescription: ");
		result.append(probableCauseDescription);
		result.append(", RecommendedActions: ");
		result.append(recommendedActions);
		result.append(", ErrorSource: ");
		result.append(errorSource);
		result.append(", ErrorSourceFormat: ");
		result.append(errorSourceFormat);
		result.append(", OtherErrorSourceFormat: ");
		result.append(otherErrorSourceFormat);
		result.append(", CIMStatusCode: ");
		result.append(cimStatusCode);
		result.append(", CIMStatusCodeDescription: ");
		result.append(cimStatusCodeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_ErrorImpl
