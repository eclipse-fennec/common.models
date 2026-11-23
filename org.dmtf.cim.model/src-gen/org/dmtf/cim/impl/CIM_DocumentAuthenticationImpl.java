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

import org.dmtf.cim.CIM_DocumentAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Document Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DocumentAuthenticationImpl#getTypeOfDocument <em>Type Of Document</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DocumentAuthenticationImpl#getOtherDocument <em>Other Document</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DocumentAuthenticationImpl#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DocumentAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_DocumentAuthentication {
	/**
	 * The default value of the '{@link #getTypeOfDocument() <em>Type Of Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDocument()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfDocument() <em>Type Of Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDocument()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfDocument = TYPE_OF_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDocument() <em>Other Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDocument() <em>Other Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDocument()
	 * @generated
	 * @ordered
	 */
	protected String otherDocument = OTHER_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentIdentifier() <em>Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentIdentifier() <em>Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String documentIdentifier = DOCUMENT_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DocumentAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DocumentAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfDocument() {
		return typeOfDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfDocument(Integer newTypeOfDocument) {
		Integer oldTypeOfDocument = typeOfDocument;
		typeOfDocument = newTypeOfDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOCUMENT_AUTHENTICATION__TYPE_OF_DOCUMENT, oldTypeOfDocument, typeOfDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDocument() {
		return otherDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDocument(String newOtherDocument) {
		String oldOtherDocument = otherDocument;
		otherDocument = newOtherDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOCUMENT_AUTHENTICATION__OTHER_DOCUMENT, oldOtherDocument, otherDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentIdentifier() {
		return documentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentIdentifier(String newDocumentIdentifier) {
		String oldDocumentIdentifier = documentIdentifier;
		documentIdentifier = newDocumentIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOCUMENT_AUTHENTICATION__DOCUMENT_IDENTIFIER, oldDocumentIdentifier, documentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__TYPE_OF_DOCUMENT:
				return getTypeOfDocument();
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__OTHER_DOCUMENT:
				return getOtherDocument();
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__DOCUMENT_IDENTIFIER:
				return getDocumentIdentifier();
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
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__TYPE_OF_DOCUMENT:
				setTypeOfDocument((Integer)newValue);
				return;
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__OTHER_DOCUMENT:
				setOtherDocument((String)newValue);
				return;
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier((String)newValue);
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
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__TYPE_OF_DOCUMENT:
				setTypeOfDocument(TYPE_OF_DOCUMENT_EDEFAULT);
				return;
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__OTHER_DOCUMENT:
				setOtherDocument(OTHER_DOCUMENT_EDEFAULT);
				return;
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier(DOCUMENT_IDENTIFIER_EDEFAULT);
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
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__TYPE_OF_DOCUMENT:
				return TYPE_OF_DOCUMENT_EDEFAULT == null ? typeOfDocument != null : !TYPE_OF_DOCUMENT_EDEFAULT.equals(typeOfDocument);
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__OTHER_DOCUMENT:
				return OTHER_DOCUMENT_EDEFAULT == null ? otherDocument != null : !OTHER_DOCUMENT_EDEFAULT.equals(otherDocument);
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION__DOCUMENT_IDENTIFIER:
				return DOCUMENT_IDENTIFIER_EDEFAULT == null ? documentIdentifier != null : !DOCUMENT_IDENTIFIER_EDEFAULT.equals(documentIdentifier);
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
		result.append(" (TypeOfDocument: ");
		result.append(typeOfDocument);
		result.append(", OtherDocument: ");
		result.append(otherDocument);
		result.append(", DocumentIdentifier: ");
		result.append(documentIdentifier);
		result.append(')');
		return result.toString();
	}

} //CIM_DocumentAuthenticationImpl
