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

import org.dmtf.cim.CIM_IndicationFilter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indication Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getSourceNamespace <em>Source Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getSourceNamespaces <em>Source Namespaces</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getIndividualSubscriptionSupported <em>Individual Subscription Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationFilterImpl#getTemplateVariable <em>Template Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IndicationFilterImpl extends CIM_ManagedElementImpl implements CIM_IndicationFilter {
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
	 * The default value of the '{@link #getSourceNamespace() <em>Source Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceNamespace() <em>Source Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNamespace()
	 * @generated
	 * @ordered
	 */
	protected String sourceNamespace = SOURCE_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNamespaces() <em>Source Namespaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceNamespaces;

	/**
	 * The default value of the '{@link #getIndividualSubscriptionSupported() <em>Individual Subscription Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualSubscriptionSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INDIVIDUAL_SUBSCRIPTION_SUPPORTED_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIndividualSubscriptionSupported() <em>Individual Subscription Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualSubscriptionSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean individualSubscriptionSupported = INDIVIDUAL_SUBSCRIPTION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected String queryLanguage = QUERY_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateVariable() <em>Template Variable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<String> templateVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicationFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IndicationFilter();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceNamespace() {
		return sourceNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceNamespace(String newSourceNamespace) {
		String oldSourceNamespace = sourceNamespace;
		sourceNamespace = newSourceNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACE, oldSourceNamespace, sourceNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSourceNamespaces() {
		if (sourceNamespaces == null) {
			sourceNamespaces = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACES);
		}
		return sourceNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIndividualSubscriptionSupported() {
		return individualSubscriptionSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualSubscriptionSupported(Boolean newIndividualSubscriptionSupported) {
		Boolean oldIndividualSubscriptionSupported = individualSubscriptionSupported;
		individualSubscriptionSupported = newIndividualSubscriptionSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__INDIVIDUAL_SUBSCRIPTION_SUPPORTED, oldIndividualSubscriptionSupported, individualSubscriptionSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueryLanguage() {
		return queryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLanguage(String newQueryLanguage) {
		String oldQueryLanguage = queryLanguage;
		queryLanguage = newQueryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION_FILTER__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTemplateVariable() {
		if (templateVariable == null) {
			templateVariable = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATION_FILTER__TEMPLATE_VARIABLE);
		}
		return templateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_INDICATION_FILTER__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_INDICATION_FILTER__NAME:
				return getName();
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACE:
				return getSourceNamespace();
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACES:
				return getSourceNamespaces();
			case CimPackage.CIM_INDICATION_FILTER__INDIVIDUAL_SUBSCRIPTION_SUPPORTED:
				return getIndividualSubscriptionSupported();
			case CimPackage.CIM_INDICATION_FILTER__QUERY:
				return getQuery();
			case CimPackage.CIM_INDICATION_FILTER__QUERY_LANGUAGE:
				return getQueryLanguage();
			case CimPackage.CIM_INDICATION_FILTER__TEMPLATE_VARIABLE:
				return getTemplateVariable();
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
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACE:
				setSourceNamespace((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACES:
				getSourceNamespaces().clear();
				getSourceNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__INDIVIDUAL_SUBSCRIPTION_SUPPORTED:
				setIndividualSubscriptionSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__QUERY:
				setQuery((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__QUERY_LANGUAGE:
				setQueryLanguage((String)newValue);
				return;
			case CimPackage.CIM_INDICATION_FILTER__TEMPLATE_VARIABLE:
				getTemplateVariable().clear();
				getTemplateVariable().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACE:
				setSourceNamespace(SOURCE_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACES:
				getSourceNamespaces().clear();
				return;
			case CimPackage.CIM_INDICATION_FILTER__INDIVIDUAL_SUBSCRIPTION_SUPPORTED:
				setIndividualSubscriptionSupported(INDIVIDUAL_SUBSCRIPTION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__QUERY_LANGUAGE:
				setQueryLanguage(QUERY_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION_FILTER__TEMPLATE_VARIABLE:
				getTemplateVariable().clear();
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
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_INDICATION_FILTER__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_INDICATION_FILTER__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_INDICATION_FILTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACE:
				return SOURCE_NAMESPACE_EDEFAULT == null ? sourceNamespace != null : !SOURCE_NAMESPACE_EDEFAULT.equals(sourceNamespace);
			case CimPackage.CIM_INDICATION_FILTER__SOURCE_NAMESPACES:
				return sourceNamespaces != null && !sourceNamespaces.isEmpty();
			case CimPackage.CIM_INDICATION_FILTER__INDIVIDUAL_SUBSCRIPTION_SUPPORTED:
				return INDIVIDUAL_SUBSCRIPTION_SUPPORTED_EDEFAULT == null ? individualSubscriptionSupported != null : !INDIVIDUAL_SUBSCRIPTION_SUPPORTED_EDEFAULT.equals(individualSubscriptionSupported);
			case CimPackage.CIM_INDICATION_FILTER__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case CimPackage.CIM_INDICATION_FILTER__QUERY_LANGUAGE:
				return QUERY_LANGUAGE_EDEFAULT == null ? queryLanguage != null : !QUERY_LANGUAGE_EDEFAULT.equals(queryLanguage);
			case CimPackage.CIM_INDICATION_FILTER__TEMPLATE_VARIABLE:
				return templateVariable != null && !templateVariable.isEmpty();
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
		result.append(", SourceNamespace: ");
		result.append(sourceNamespace);
		result.append(", SourceNamespaces: ");
		result.append(sourceNamespaces);
		result.append(", IndividualSubscriptionSupported: ");
		result.append(individualSubscriptionSupported);
		result.append(", Query: ");
		result.append(query);
		result.append(", QueryLanguage: ");
		result.append(queryLanguage);
		result.append(", TemplateVariable: ");
		result.append(templateVariable);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicationFilterImpl
