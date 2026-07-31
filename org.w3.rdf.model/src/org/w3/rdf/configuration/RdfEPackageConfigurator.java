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
package org.w3.rdf.configuration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.fennec.emf.osgi.configurator.EPackageConfigurator;

import org.eclipse.fennec.emf.osgi.constants.EMFNamespaces;

import org.w3.rdf.RdfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This library models the elements in the RDF namespace, http://www.w3.org/1999/02/22-rdf-syntax-ns, for use in vocabulary development.
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class RdfEPackageConfigurator implements EPackageConfigurator {
	
	/**
	 * The fingerprint of this model version, computed from the <code>.ecore</code> at build
	 * time. It identifies the model content, not the artifact - see the <code>emf.fingerprint</code>
	 * service property.
	 * @generated
	 */
	public static final String FINGERPRINT = "fp1:5ab6f2c31dc90d2bb296869b31eb161f4aed65073655475f5e3bb81d5b4d2df2";

	private RdfPackage ePackage;

	protected RdfEPackageConfigurator(RdfPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(RdfPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(RdfPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_NAME, RdfPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, RdfPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_PROVIDED);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "rdf");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		properties.put(EMFNamespaces.EMF_MODEL_FINGERPRINT, FINGERPRINT);
		return properties;
	}
}