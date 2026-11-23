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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_HelpService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Help Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getDeliveryOptions <em>Delivery Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getOtherDeliveryOptionDescription <em>Other Delivery Option Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getDocumentsAvailable <em>Documents Available</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getDocumentDescriptions <em>Document Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getDocumentFormat <em>Document Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_HelpServiceImpl#getOtherDocumentFormatDescription <em>Other Document Format Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_HelpServiceImpl extends CIM_ServiceImpl implements CIM_HelpService {
	/**
	 * The cached value of the '{@link #getDeliveryOptions() <em>Delivery Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> deliveryOptions;

	/**
	 * The default value of the '{@link #getOtherDeliveryOptionDescription() <em>Other Delivery Option Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDeliveryOptionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DELIVERY_OPTION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDeliveryOptionDescription() <em>Other Delivery Option Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDeliveryOptionDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherDeliveryOptionDescription = OTHER_DELIVERY_OPTION_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentsAvailable() <em>Documents Available</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentsAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<String> documentsAvailable;

	/**
	 * The cached value of the '{@link #getDocumentDescriptions() <em>Document Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> documentDescriptions;

	/**
	 * The cached value of the '{@link #getDocumentFormat() <em>Document Format</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> documentFormat;

	/**
	 * The default value of the '{@link #getOtherDocumentFormatDescription() <em>Other Document Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDocumentFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DOCUMENT_FORMAT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDocumentFormatDescription() <em>Other Document Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDocumentFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherDocumentFormatDescription = OTHER_DOCUMENT_FORMAT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_HelpServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_HelpService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDeliveryOptions() {
		if (deliveryOptions == null) {
			deliveryOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HELP_SERVICE__DELIVERY_OPTIONS);
		}
		return deliveryOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDeliveryOptionDescription() {
		return otherDeliveryOptionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDeliveryOptionDescription(String newOtherDeliveryOptionDescription) {
		String oldOtherDeliveryOptionDescription = otherDeliveryOptionDescription;
		otherDeliveryOptionDescription = newOtherDeliveryOptionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HELP_SERVICE__OTHER_DELIVERY_OPTION_DESCRIPTION, oldOtherDeliveryOptionDescription, otherDeliveryOptionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDocumentsAvailable() {
		if (documentsAvailable == null) {
			documentsAvailable = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_HELP_SERVICE__DOCUMENTS_AVAILABLE);
		}
		return documentsAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDocumentDescriptions() {
		if (documentDescriptions == null) {
			documentDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_HELP_SERVICE__DOCUMENT_DESCRIPTIONS);
		}
		return documentDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDocumentFormat() {
		if (documentFormat == null) {
			documentFormat = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HELP_SERVICE__DOCUMENT_FORMAT);
		}
		return documentFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDocumentFormatDescription() {
		return otherDocumentFormatDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDocumentFormatDescription(String newOtherDocumentFormatDescription) {
		String oldOtherDocumentFormatDescription = otherDocumentFormatDescription;
		otherDocumentFormatDescription = newOtherDocumentFormatDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HELP_SERVICE__OTHER_DOCUMENT_FORMAT_DESCRIPTION, oldOtherDocumentFormatDescription, otherDocumentFormatDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetHelp(String RequestedDocument, Integer Format, Integer RequestedDelivery, String DocumentInfo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_HELP_SERVICE__DELIVERY_OPTIONS:
				return getDeliveryOptions();
			case CimPackage.CIM_HELP_SERVICE__OTHER_DELIVERY_OPTION_DESCRIPTION:
				return getOtherDeliveryOptionDescription();
			case CimPackage.CIM_HELP_SERVICE__DOCUMENTS_AVAILABLE:
				return getDocumentsAvailable();
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_DESCRIPTIONS:
				return getDocumentDescriptions();
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_FORMAT:
				return getDocumentFormat();
			case CimPackage.CIM_HELP_SERVICE__OTHER_DOCUMENT_FORMAT_DESCRIPTION:
				return getOtherDocumentFormatDescription();
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
			case CimPackage.CIM_HELP_SERVICE__DELIVERY_OPTIONS:
				getDeliveryOptions().clear();
				getDeliveryOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HELP_SERVICE__OTHER_DELIVERY_OPTION_DESCRIPTION:
				setOtherDeliveryOptionDescription((String)newValue);
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENTS_AVAILABLE:
				getDocumentsAvailable().clear();
				getDocumentsAvailable().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_DESCRIPTIONS:
				getDocumentDescriptions().clear();
				getDocumentDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_FORMAT:
				getDocumentFormat().clear();
				getDocumentFormat().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HELP_SERVICE__OTHER_DOCUMENT_FORMAT_DESCRIPTION:
				setOtherDocumentFormatDescription((String)newValue);
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
			case CimPackage.CIM_HELP_SERVICE__DELIVERY_OPTIONS:
				getDeliveryOptions().clear();
				return;
			case CimPackage.CIM_HELP_SERVICE__OTHER_DELIVERY_OPTION_DESCRIPTION:
				setOtherDeliveryOptionDescription(OTHER_DELIVERY_OPTION_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENTS_AVAILABLE:
				getDocumentsAvailable().clear();
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_DESCRIPTIONS:
				getDocumentDescriptions().clear();
				return;
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_FORMAT:
				getDocumentFormat().clear();
				return;
			case CimPackage.CIM_HELP_SERVICE__OTHER_DOCUMENT_FORMAT_DESCRIPTION:
				setOtherDocumentFormatDescription(OTHER_DOCUMENT_FORMAT_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_HELP_SERVICE__DELIVERY_OPTIONS:
				return deliveryOptions != null && !deliveryOptions.isEmpty();
			case CimPackage.CIM_HELP_SERVICE__OTHER_DELIVERY_OPTION_DESCRIPTION:
				return OTHER_DELIVERY_OPTION_DESCRIPTION_EDEFAULT == null ? otherDeliveryOptionDescription != null : !OTHER_DELIVERY_OPTION_DESCRIPTION_EDEFAULT.equals(otherDeliveryOptionDescription);
			case CimPackage.CIM_HELP_SERVICE__DOCUMENTS_AVAILABLE:
				return documentsAvailable != null && !documentsAvailable.isEmpty();
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_DESCRIPTIONS:
				return documentDescriptions != null && !documentDescriptions.isEmpty();
			case CimPackage.CIM_HELP_SERVICE__DOCUMENT_FORMAT:
				return documentFormat != null && !documentFormat.isEmpty();
			case CimPackage.CIM_HELP_SERVICE__OTHER_DOCUMENT_FORMAT_DESCRIPTION:
				return OTHER_DOCUMENT_FORMAT_DESCRIPTION_EDEFAULT == null ? otherDocumentFormatDescription != null : !OTHER_DOCUMENT_FORMAT_DESCRIPTION_EDEFAULT.equals(otherDocumentFormatDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_HELP_SERVICE___GET_HELP__STRING_INTEGER_INTEGER_STRING:
				return GetHelp((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (DeliveryOptions: ");
		result.append(deliveryOptions);
		result.append(", OtherDeliveryOptionDescription: ");
		result.append(otherDeliveryOptionDescription);
		result.append(", DocumentsAvailable: ");
		result.append(documentsAvailable);
		result.append(", DocumentDescriptions: ");
		result.append(documentDescriptions);
		result.append(", DocumentFormat: ");
		result.append(documentFormat);
		result.append(", OtherDocumentFormatDescription: ");
		result.append(otherDocumentFormatDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_HelpServiceImpl
