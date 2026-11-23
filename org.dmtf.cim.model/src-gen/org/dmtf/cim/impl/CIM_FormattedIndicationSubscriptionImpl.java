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

import org.dmtf.cim.CIM_FormattedIndicationSubscription;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Formatted Indication Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FormattedIndicationSubscriptionImpl#getTextFormatOwningEntity <em>Text Format Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FormattedIndicationSubscriptionImpl#getTextFormatID <em>Text Format ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FormattedIndicationSubscriptionImpl#getTextFormat <em>Text Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FormattedIndicationSubscriptionImpl#getTextFormatParameters <em>Text Format Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FormattedIndicationSubscriptionImpl extends CIM_IndicationSubscriptionImpl implements CIM_FormattedIndicationSubscription {
	/**
	 * The default value of the '{@link #getTextFormatOwningEntity() <em>Text Format Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormatOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_OWNING_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFormatOwningEntity() <em>Text Format Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormatOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected String textFormatOwningEntity = TEXT_FORMAT_OWNING_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFormatID() <em>Text Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormatID()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFormatID() <em>Text Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormatID()
	 * @generated
	 * @ordered
	 */
	protected String textFormatID = TEXT_FORMAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected String textFormat = TEXT_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextFormatParameters() <em>Text Format Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormatParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> textFormatParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FormattedIndicationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FormattedIndicationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormatOwningEntity() {
		return textFormatOwningEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormatOwningEntity(String newTextFormatOwningEntity) {
		String oldTextFormatOwningEntity = textFormatOwningEntity;
		textFormatOwningEntity = newTextFormatOwningEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_OWNING_ENTITY, oldTextFormatOwningEntity, textFormatOwningEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormatID() {
		return textFormatID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormatID(String newTextFormatID) {
		String oldTextFormatID = textFormatID;
		textFormatID = newTextFormatID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_ID, oldTextFormatID, textFormatID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormat() {
		return textFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormat(String newTextFormat) {
		String oldTextFormat = textFormat;
		textFormat = newTextFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT, oldTextFormat, textFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTextFormatParameters() {
		if (textFormatParameters == null) {
			textFormatParameters = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_PARAMETERS);
		}
		return textFormatParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_OWNING_ENTITY:
				return getTextFormatOwningEntity();
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_ID:
				return getTextFormatID();
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT:
				return getTextFormat();
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_PARAMETERS:
				return getTextFormatParameters();
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
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_OWNING_ENTITY:
				setTextFormatOwningEntity((String)newValue);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_ID:
				setTextFormatID((String)newValue);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT:
				setTextFormat((String)newValue);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_PARAMETERS:
				getTextFormatParameters().clear();
				getTextFormatParameters().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_OWNING_ENTITY:
				setTextFormatOwningEntity(TEXT_FORMAT_OWNING_ENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_ID:
				setTextFormatID(TEXT_FORMAT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT:
				setTextFormat(TEXT_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_PARAMETERS:
				getTextFormatParameters().clear();
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
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_OWNING_ENTITY:
				return TEXT_FORMAT_OWNING_ENTITY_EDEFAULT == null ? textFormatOwningEntity != null : !TEXT_FORMAT_OWNING_ENTITY_EDEFAULT.equals(textFormatOwningEntity);
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_ID:
				return TEXT_FORMAT_ID_EDEFAULT == null ? textFormatID != null : !TEXT_FORMAT_ID_EDEFAULT.equals(textFormatID);
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT:
				return TEXT_FORMAT_EDEFAULT == null ? textFormat != null : !TEXT_FORMAT_EDEFAULT.equals(textFormat);
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION__TEXT_FORMAT_PARAMETERS:
				return textFormatParameters != null && !textFormatParameters.isEmpty();
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
		result.append(" (TextFormatOwningEntity: ");
		result.append(textFormatOwningEntity);
		result.append(", TextFormatID: ");
		result.append(textFormatID);
		result.append(", TextFormat: ");
		result.append(textFormat);
		result.append(", TextFormatParameters: ");
		result.append(textFormatParameters);
		result.append(')');
		return result.toString();
	}

} //CIM_FormattedIndicationSubscriptionImpl
